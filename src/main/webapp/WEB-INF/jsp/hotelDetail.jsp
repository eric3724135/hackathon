<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="utf-8" />
<!-- Bootstrap Core CSS -->
<link href="/hackthon/resource/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="/hackthon/resource/css/stylish-portfolio.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="/hackthon/resource/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<script src="/hackthon/resource/js/jquery-2.1.3.min.js"></script>
<script src="/hackthon/resource/js/jquery.tinyMap-3.2.4.min.js"></script>
<script
	src="http://maps.googleapis.com/maps/api/js?v=3.7&sensor=false&language=en"></script>
<script src="/hackthon/resource/js/map.js"></script>
<title>${hotel.title}</title>
<style type="text/css">
.header {
	height: 30%;
}

.map {
	width: 80%;
	height: 60%;
}
</style>
</head>
<body>
	<!-- Header -->
	<header id="top" class="header">
		<div class="text-vertical-center">
			<h1>Traveling time</h1>
			<h3>Days &amp; Hotels</h3>
		</div>
	</header>
	<br>
	<section class="container">
		<div class="row">
			<div class="col-md-5">

				<c:forEach items="${hotel.imgUrl}" var="img">
					<div class="col-md-5">
						<img src='${img }' alt="image" style="width: 100%" />
					</div>
				</c:forEach>

			</div>
			<div class="col-md-5">
				<h3>${hotel.title}</h3>
				<p>
					<strong>Address : </strong>${hotel.address}</p>
				<p>
					<strong>Description : </strong> ${hotel.xbody}
				</p>
				<p>

					<strong>TEL : </strong> <span class="label label-warning">${hotel.tel}</span>
				</p>
				<p>
					<strong>Minimum</strong> : ${hotel.cost}
				</p>
			</div>
		</div>
		<br>
		<div>
			<div class="map" id="map"></div>
		</div>
	</section>
	<script type="text/javascript">
		var map;
		var lat;
		var log;
		function initialize() {
			map = new google.maps.Map(document.getElementById('map-canvas'), {
				zoom : 8,
				center : {
					lat : Number(lat),
					lng : Number(log)
				}
			});
		}

		google.maps.event.addDomListener(window, 'load', initialize);
		
		$(document).ready(function() {
			"use strict";
			
			$.ajax({
				url : '/hackthon/hotels/hotelDetail/${hotel.serialNo}',
				type : "GET",
				dataType : 'json',
				success : function(data, textStatus) {
					
					lat = data.latitude;
					log = data.longitude;

				},
				error : function(xhr, ajaxOptions, thrownError) {
					alert(xhr.status);
					alert(thrownError);
				}
			});

		});
	</script>


</body>
</html>