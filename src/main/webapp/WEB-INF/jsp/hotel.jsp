<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<head>
<!-- Bootstrap Core CSS -->
<link href="/hackthon/resource/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="/hackthon/resource/css/stylish-portfolio.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="/hackthon/resource/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<title>select one Hotel</title>
<style type="text/css">
.header {
	height: 30%;
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
			<c:forEach items="${hotels}" var="hotel">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<img src='${hotel.imgUrl[0]}' alt="image" style="width: 100%" />
						<div class="caption">
							<h3>${hotel.title}</h3>
							<p>${hotel.address}</p>
							<p>
								<span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>${hotel.tel}</p>
							<p>Minimum ${hotel.cost} costs</p>
							<p>
								<a
									href="<spring:url value='/hotels/hotel/${hotel.serialNo}'/>"
									class="btn btn-primary"> <span
									class="glyphicon glyphicon-home"></span> Details
								</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>