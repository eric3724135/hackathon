<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html data-ng-app="taiwanApp">
<head>
<!-- Bootstrap Core CSS -->
<link href="/hackthon/resource/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="/hackthon/resource/css/stylish-portfolio.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="/hackthon/resource/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" media="screen"
	href="resource/css/city.css">
<link rel="stylesheet" href="/hackthon/resource/css/bootstrap.min.css">
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script type="text/javascript" src="resource/js/Taiwan.js"></script>
<script type="text/javascript" src="resource/js/bootstrap-select.min.js"></script>
<title>Information</title>
</head>
<body>

	<!-- Header -->
	<header id="top" class="header">
		<div class="text-vertical-center">
			<h1>Traveling time</h1>
			<h3>Days &amp; Hotels</h3>
			<br> <a href="#contry" class="btn btn-dark btn-lg">Find it</a>
		</div>
	</header>

	<!-- About -->
	<section id="contry" class="about">
		<div class="container">
			<!-- 			<div class="row"> -->
			<!-- 				<div class="col-lg-12 text-center"> -->
<!-- 			<h2>放地圖放地圖</h2> -->
<!-- 			<p class="lead">This theme features some wonderful photography -->
<!-- 				courtesy of</p> -->
			<div data-ng-controller="taiwanCtl">
				<div id="contaxt">
					<div id="left_menu"></div>
					<div id="main_con">
						<div id="main_top"></div>
						<div>
							<div id="seardh_bar_1" title="query_condition"
								style="display: block;">
								<table style="height: 72" border="0" cellpadding="0"
									cellspacing="0">
									<colgroup>
										<col style="width: 100px">
										<col style="width: 130px">
										<col style="width: 130px">
										<col style="width: 70px">
										<col style="width: 40px">
										<col style="width: 50px">
									</colgroup>
									<tbody>
										<tr>
											<td></td>
											<td align="left">選擇要出發的地點</td>
											<td>
												<div class="selectpicker">
													<select data-ng-model="city"
														data-ng-options="city for city in city">
														<option value="">-- 請選擇 --</option>
													</select>
												</div>
											</td>
											<td>預計天數</td>
											<td><input type="text" data-ng-model="day"
												style="width: 30px"></td>
											<td>天</td>
											<td><button data-ng-click="query()">click</button></td>
										</tr>
									</tbody>
								</table>
							</div>
							<div id="tw" style="display: block;">
								<div id="keelung">
									<a href="#" class="n_1" id="maplink_keelung">基隆市</a>
								</div>
								<div id="taipei">
									<a href="#" class="n_1" id="maplink_taipei">台北市</a>
								</div>
								<div id="n_taipei">
									<a href="#" class="n_1" id="maplink_n_taipei">新北市</a>
								</div>
								<div id="taoyuan">
									<a href="#" class="n_2" id="maplink_taoyuan">桃園市</a>
								</div>
								<div id="hsinchu">
									<a href="#" class="n_2" id="maplink_hsinchu">新竹市</a>
								</div>
								<div id="hsinchu_cinuty">
									<a href="#" class="n_2" id="maplink_hsinchu_cinuty">新竹縣</a>
								</div>
								<div id="Miaoli">
									<a href="#" class="n_2" id="maplink_Miaoli">苗栗縣</a>
								</div>
								<div id="taichung">
									<a href="#" class="c" id="maplink_taichung">台中市</a>
								</div>
								<div id="changhua">
									<a href="#" class="c" id="maplink_changhua">彰化縣</a>
								</div>
								<div id="nantou">
									<a href="#" class="c" id="maplink_nantou">南投縣</a>
								</div>
								<div id="yunlin">
									<a href="#" class="w" id="maplink_yunlin">雲林縣</a>
								</div>
								<div id="chiayi_c">
									<a href="#" class="w" id="maplink_chiayi_c">嘉義縣</a>
								</div>
								<div id="chiayi">
									<a href="#" class="w" id="maplink_chiayi">嘉義市</a>
								</div>
								<div id="tainan">
									<a href="#" class="s" id="maplink_tainan">台南市</a>
								</div>
								<div id="kaohsiung">
									<a href="#" class="s" id="maplink_kaohsiung">高雄市</a>
								</div>
								<div id="pingtung">
									<a href="#" class="s" id="maplink_pingtung">屏東縣</a>
								</div>
								<div id="ilan">
									<a href="#" class="e" id="maplink_ilan">宜蘭縣</a>
								</div>
								<div id="hualien">
									<a href="#" class="e" id="maplink_hualien">花蓮縣</a>
								</div>
								<div id="taitung">
									<a href="#" class="e" id="maplink_taitung">台東縣</a>
								</div>
							</div>
						</div>
					</div>
					<div id="main_left"></div>
					<div id="main_right"></div>
				</div>
			</div>
			<!-- 				</div> -->
			<!-- 			</div> -->
			<!-- /.row -->
		</div>
		<!-- /.container -->
	</section>

	<script type="text/javascript">
		//Scrolls to the selected menu item on the page
		$(function() {
			$('a[href*=#]:not([href=#])')
					.click(
							function() {
								if (location.pathname.replace(/^\//, '') == this.pathname
										.replace(/^\//, '')
										&& location.hostname == this.hostname) {
									var target = $(this.hash);
									target = target.length ? target
											: $('[name=' + this.hash.slice(1)
													+ ']');
									if (target.length) {
										$('html,body').animate({
											scrollTop : target.offset().top
										}, 1000);
										return false;
									}
								}
							});
		});
	</script>

</body>
</html>