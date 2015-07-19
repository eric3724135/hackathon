<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<style>
body {
	font: 10px sans-serif;
}

.axis path, .axis line {
	fill: none;
	stroke: #000;
	shape-rendering: crispEdges;
}

.bar {
	fill: orange;
}

.bar:hover {
	fill: orangered;
}

.x.axis path {
	display: none;
}

.d3-tip {
	line-height: 1;
	font-weight: bold;
	padding: 12px;
	background: rgba(0, 0, 0, 0.8);
	color: #fff;
	border-radius: 2px;
}

/* Creates a small triangle extender for the tooltip */
.d3-tip:after {
	box-sizing: border-box;
	display: inline;
	font-size: 10px;
	width: 100%;
	line-height: 1;
	color: rgba(0, 0, 0, 0.8);
	content: "\25BC";
	position: absolute;
	text-align: center;
}

/* Style northward tooltips differently */
.d3-tip.n:after {
	margin: -1px 0 0 0;
	top: 100%;
	left: 0;
}
</style>

<link rel="stylesheet" href="/hackthon/resource/css/bootstrap.min.css">
<script src="/hackthon/resource/js/angular.min.js"></script>
<script src="/hackthon/resource/js/jquery-2.1.3.min.js"></script>
<script src="/hackthon/resource/js/jquery.tinyMap-3.2.4.min.js"></script>
<script src="/hackthon/resource/js/d3.v3.min.js"></script>
<script src="/hackthon/resource/js/d3.tip.v0.6.3.js"></script>
<title>Taiwan Go</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Taiwan Go</h1>
			</div>
		</div>
	</section>
	<div class="row">
		<div class="col-md-2 "></div>
		<div id="bar" class="col-md-8 "></div>
		<div class="col-md-2"></div>
	</div>



	<script>
		var margin = {
			top : 40,
			right : 20,
			bottom : 30,
			left : 40
		}, width = 960 - margin.left - margin.right, height = 500 - margin.top
				- margin.bottom;

		var formatPercent = d3.format(".0%");

		var x = d3.scale.ordinal().rangeRoundBands([ 0, width ], .1);

		var y = d3.scale.linear().range([ height, 0 ]);

		var xAxis = d3.svg.axis().scale(x).orient("bottom");

		var yAxis = d3.svg.axis().scale(y).orient("left").tickFormat(
				formatPercent);

		var tip = d3
				.tip()
				.attr('class', 'd3-tip')
				.offset([ -10, 0 ])
				.html(
						function(d) {
							return "<strong>Frequency:</strong> <span style='color:red'>"
									+ d.frequency + "</span>";
						})

		var svg = d3.select("#bar").append("svg").attr("id", "chart").attr(
				"width", width + margin.left + margin.right).attr("height",
				height + margin.top + margin.bottom).append("g").attr(
				"transform",
				"translate(" + margin.left + "," + margin.top + ")");

		svg.call(tip);

		d3.tsv("/hackthon/tsv", type, function(error, data) {
			x.domain(data.map(function(d) {
				return d.letter;
			}));
			y.domain([ 0, d3.max(data, function(d) {
				return d.frequency;
			}) ]);

			svg.append("g").attr("class", "x axis").attr("transform",
					"translate(0," + height + ")").call(xAxis);

			svg.append("g").attr("class", "y axis").call(yAxis).append("text")
					.attr("transform", "rotate(-90)").attr("y", 6).attr("dy",
							".71em").style("text-anchor", "end").text(
							"Frequency");

			svg.selectAll(".bar").data(data).enter().append("rect").attr(
					"class", "bar").attr("x", function(d) {
				return x(d.letter);
			}).attr("width", x.rangeBand()).attr("y", function(d) {
				return y(d.frequency);
			}).attr("height", function(d) {
				return height - y(d.frequency);
			}).on('mouseover', tip.show).on('mouseout', tip.hide)

		});

		function type(d) {
			d.frequency = +d.frequency;
			return d;
		}
		var aspect = 960 / 500, chart = $("#chart");
		$(window).on("resize", function() {
			var targetWidth = chart.parent().width();
			chart.attr("width", targetWidth);
			chart.attr("height", targetWidth / aspect);
		});
		
		d3.select(window).on('resize', resize); 

		function resize() {
		    // update width
		    width = parseInt(d3.select('#bar').style('width'), 10);
		    width = width - margin.left - margin.right;

		    // resize the chart
		    x.range([0, width]);
		    d3.select(chart.node().parentNode)
		        .style('height', (y.rangeExtent()[1] + margin.top + margin.bottom) + 'px')
		        .style('width', (width + margin.left + margin.right) + 'px');

		    chart.selectAll('rect.background')
		        .attr('width', width);

		    chart.selectAll('rect.percent')
		        .attr('width', function(d) { return x(d.percent); });

		    // update median ticks
		    var median = d3.median(chart.selectAll('.bar').data(), 
		        function(d) { return d.percent; });

		    chart.selectAll('line.median')
		        .attr('x1', x(median))
		        .attr('x2', x(median));


		    // update axes
		    chart.select('.x.axis.top').call(xAxis.orient('top'));
		    chart.select('.x.axis.bottom').call(xAxis.orient('bottom'));

		}
	</script>
</body>
</html>