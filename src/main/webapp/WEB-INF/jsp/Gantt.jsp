<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Gantt Chart Example 3</title>
<link type="text/css" href="http://mbostock.github.io/d3/style.css"
	rel="stylesheet" />
<link type="text/css" href="example.css" rel="stylesheet" />
</head>
<body>

	<button type="button" onclick="addTask()">Add Task</button>
	<button type="button" onclick="removeTask()">Remove Task</button>
	<button type="button" onclick="changeTimeDomain('1hr')">1 HR</button>
	<button type="button" onclick="changeTimeDomain('3hr')">3 HR</button>
	<button type="button" onclick="changeTimeDomain('6hr')">6 HR</button>
	<button type="button" onclick="changeTimeDomain('1day')">1 DAY</button>
	<button type="button" onclick="changeTimeDomain('1week')">1
		WEEK</button>
</body>
</html>
<script src="/hackthon/resource/js/d3.v3.min.js"></script>
<script type="text/javascript"
	src="http://static.mentful.com/gantt-chart-d3v2.js"></script>
<script type="text/javascript" src="example3.js"></script>