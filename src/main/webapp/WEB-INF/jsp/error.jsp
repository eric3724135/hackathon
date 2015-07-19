<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/hackthon/resource/css/bootstrap.min.css">
<title>${title}</title>
</head>
<body>
	<section>
	<div class="jumbotron">
		<div class="container">
			
			<div class="col-md-8">
				<h1 style="color: red;">${title}</h1>
				<h3 style="color: red;">${message}</h3>
			</div>

		</div>
	</div>
	</section>
</body>
</html>