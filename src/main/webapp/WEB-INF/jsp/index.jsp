<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
										<col style="width: 50px">
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
														data-ng-options="city for city in cityList">
<!-- 														<option value="">-- 請選擇 --</option> -->
													</select>
												</div>
											</td>
											<td>預計天數</td>
											<td><input type="text" data-ng-model="day"
												style="width: 35px" maxlength="2" class="tx_box" required></td>
											<td>天</td>
											<td><button class="btn btn-outline btn-primary" data-ng-click="query()">查詢</button></td>
											<td><button class="btn btn-outline btn-primary" data-ng-click="doMyself()">自行規劃</button></td>
											<td><button class="btn btn-outline btn-primary" data-ng-click="check()">確定行程</button></td>
										</tr>
									</tbody>
								</table>
								<div style="text-align: center;color:#B80000;font-size: 15px;">{{alert}}</div>
							</div>
							<div id="tw" style="display: block;">
								<div id="keelung">
									<input type="checkbox" id="keelungChk" data-ng-model="keelungChk" value="基隆市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=基隆市'/>" class="n_1" id="maplink_keelung" data-ng-show="keelungChk">基隆市</a>
									<label data-ng-hide="keelungChk">基隆市</label>
								</div>
								<div id="taipei">
									<input type="checkbox" id="taipeiChk" data-ng-model="taipeiChk" value="台北市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=臺北市'/>" class="n_1" id="maplink_taipei" data-ng-show="taipeiChk">台北市</a>
									<label data-ng-hide="taipeiChk">台北市</label>
								</div>
								<div id="n_taipei">
									<input type="checkbox" id="n_taipeiChk" data-ng-model="n_taipeiChk" value="新北市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=新北市'/>" class="n_1" id="maplink_n_taipei" data-ng-show="n_taipeiChk">新北市</a>
									<label data-ng-hide="n_taipeiChk">新北市</label>
								</div>
								<div id="taoyuan">
									<input type="checkbox" id="taoyuanChk" data-ng-model="taoyuanChk" value="桃園市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=桃園市'/>" class="n_2" id="maplink_taoyuan" data-ng-show="taoyuanChk">桃園市</a>
									<label data-ng-hide="taoyuanChk">桃園市</label>
								</div>
								<div id="hsinchu">
									<input type="checkbox" id="hsinchuChk" data-ng-model="hsinchuChk" value="新竹市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=新竹市'/>" class="n_2" id="maplink_hsinchu" data-ng-show="hsinchuChk">新竹市</a>
									<label data-ng-hide="hsinchuChk">新竹市</label>
								</div>
								<div id="hsinchu_cinuty">
									<input type="checkbox" id="hsinchu_cinutyChk" data-ng-model="hsinchu_cinutyChk" value="新竹縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=新竹縣'/>" class="n_2" id="maplink_hsinchu_cinuty" data-ng-show="hsinchu_cinutyChk">新竹縣</a>
									<label data-ng-hide="hsinchu_cinutyChk">新竹縣</label>
								</div>
								<div id="Miaoli">
									<input type="checkbox" id="MiaoliChk" data-ng-model="MiaoliChk" value="苗栗縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=苗栗縣'/>" class="n_2" id="maplink_Miaoli" data-ng-show="MiaoliChk">苗栗縣</a>
									<label data-ng-hide="MiaoliChk">苗栗縣</label>
								</div>
								<div id="taichung">
									<input type="checkbox" id="taichungChk" data-ng-model="taichungChk" value="台中市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=台中市'/>" class="c" id="maplink_taichung" data-ng-show="taichungChk">台中市</a>
									<label data-ng-hide="taichungChk">台中市</label>
								</div>
								<div id="changhua">
									<input type="checkbox" id="changhuaChk" data-ng-model="changhuaChk" value="彰化縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=彰化縣'/>" class="c" id="maplink_changhua" data-ng-show="changhuaChk">彰化縣</a>
									<label data-ng-hide="changhuaChk">彰化縣</label>
								</div>
								<div id="nantou">
									<input type="checkbox" id="nantouChk" data-ng-model="nantouChk" value="南投縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=南投縣'/>" class="c" id="maplink_nantou" data-ng-show="nantouChk">南投縣</a>
									<label data-ng-hide="nantouChk">南投縣</label>
								</div>
								<div id="yunlin">
									<input type="checkbox" id="yunlinChk" data-ng-model="yunlinChk" value="雲林縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=雲林縣'/>" class="w" id="maplink_yunlin" data-ng-show="yunlinChk">雲林縣</a>
									<label data-ng-hide="yunlinChk">雲林縣</label>
								</div>
								<div id="chiayi_c">
									<input type="checkbox" id="chiayi_cChk" data-ng-model="chiayi_cChk" value="嘉義縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=嘉義縣'/>" class="w" id="maplink_chiayi_c" data-ng-show="chiayi_cChk">嘉義縣</a>
									<label data-ng-hide="chiayi_cChk">嘉義縣</label>
								</div>
								<div id="chiayi">
									<input type="checkbox" id="chiayiChk" data-ng-model="chiayiChk" value="嘉義市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=嘉義市'/>#" class="w" id="maplink_chiayi" data-ng-show="chiayiChk">嘉義市</a>
									<label data-ng-hide="chiayiChk">嘉義市</label>
								</div>
								<div id="tainan">
									<input type="checkbox" id="tainanChk" data-ng-model="tainanChk" value="台南市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=台南市'/>" class="s" id="maplink_tainan" data-ng-show="tainanChk">台南市</a>
									<label data-ng-hide="tainanChk">台南市</label>
								</div>
								<div id="kaohsiung">
									<input type="checkbox" id="kaohsiungChk" data-ng-model="kaohsiungChk" value="高雄市" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=高雄市'/>#" class="s" id="maplink_kaohsiung" data-ng-show="kaohsiungChk">高雄市</a>
									<label data-ng-hide="kaohsiungChk">高雄市</label>
								</div>
								<div id="pingtung">
									<input type="checkbox" id="pingtungChk" data-ng-model="pingtungChk" value="屏東縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=屏東縣'/>" class="s" id="maplink_pingtung" data-ng-show="pingtungChk">屏東縣</a>
									<label data-ng-hide="pingtungChk">屏東縣</label>
								</div>
								<div id="ilan">
									<input type="checkbox" id="ilanChk" data-ng-model="ilanChk" value="宜蘭縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=宜蘭縣'/>" class="e" id="maplink_ilan" data-ng-show="ilanChk">宜蘭縣</a>
									<label data-ng-hide="ilanChk">宜蘭縣</label>
								</div>
								<div id="hualien">
									<input type="checkbox" id="hualienChk" data-ng-model="hualienChk" value="花蓮縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=花蓮縣'/>" class="e" id="maplink_hualien" data-ng-show="hualienChk">花蓮縣</a>
									<label data-ng-hide="hualienChk">花蓮縣</label>
								</div>
								<div id="taitung">
									<input type="checkbox" id="taitungChk" data-ng-model="taitungChk" value="台東縣" data-ng-show="visual">
									<a href="<spring:url value='/hotels/?city=台東縣'/>" class="e" id="maplink_taitung" data-ng-show="taitungChk">台東縣</a>
									<label data-ng-hide="taitungChk">台東縣</label>
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