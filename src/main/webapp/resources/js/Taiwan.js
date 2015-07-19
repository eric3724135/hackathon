(function() {
	var app = angular.module("taiwanApp", []);	
	
	app.controller('taiwanCtl',function($scope,$http,$window){
		
		$scope.cityList = ["基隆市","臺北市","新北市","桃園市","新竹縣","新竹市","苗栗縣","台中市","彰化縣","雲林縣","嘉義縣","嘉義市","台南市","高雄市","屏東縣","宜蘭縣","花蓮縣","台東縣","南投縣"];
		$scope.city = $scope.cityList[0];
		
		var count = 0;
		
		$scope.keelungChk = true;
		$scope.taipeiChk = true;
		$scope.n_taipeiChk = true;
		$scope.taoyuanChk = true;
		$scope.hsinchuChk = true;
		$scope.hsinchu_cinutyChk = true;
		$scope.MiaoliChk = true;
		$scope.taichungChk = true;
		$scope.changhuaChk = true;
		$scope.nantouChk = true;
		$scope.yunlinChk = true;
		$scope.chiayi_cChk = true;
		$scope.chiayiChk = true;
		$scope.tainanChk = true;
		$scope.kaohsiungChk = true;
		$scope.pingtungChk = true;
		$scope.ilanChk = true;
		$scope.hualienChk = true;
		$scope.taitungChk = true;
		
		$scope.query = function(){
			if ($scope.day == null && $scope.day == undefined){
				$scope.alert = "請填寫預期天數";
				return;
			}
			$http.get('/hackthon/city?startCity='+$scope.city+'&day='+$scope.day)
			.then(function(resp){
				$scope.keelungChk = false;
				$scope.taipeiChk = false;
				$scope.n_taipeiChk = false;
				$scope.taoyuanChk = false;
				$scope.hsinchuChk = false;
				$scope.hsinchu_cinutyChk = false;
				$scope.MiaoliChk = false;
				$scope.taichungChk = false;
				$scope.changhuaChk = false;
				$scope.nantouChk = false;
				$scope.yunlinChk = false;
				$scope.chiayi_cChk = false;
				$scope.chiayiChk = false;
				$scope.tainanChk = false;
				$scope.kaohsiungChk = false;
				$scope.pingtungChk = false;
				$scope.ilanChk = false;
				$scope.hualienChk = false;
				$scope.taitungChk = false;
					
				count = resp.data.length;
				for (var i=0;i<resp.data.length;i++){
					if ("基隆市" == resp.data[i])
						$scope.keelungChk = true;
					
					if ("台北市" == resp.data[i])
						$scope.taipeiChk = true;
					
					if ("新北市" == resp.data[i])
						$scope.n_taipeiChk = true;
					
					if ("桃園市" == resp.data[i])
						$scope.taoyuanChk = true;
					
					if ("新竹市" == resp.data[i])
						$scope.hsinchuChk = true;
					
					if ("新竹縣" == resp.data[i])
						$scope.hsinchu_cinutyChk = true;

					if ("苗栗縣" == resp.data[i])
						$scope.MiaoliChk = true;
					
					if ("台中市" == resp.data[i])
						$scope.taichungChk = true;
					
					if ("彰化縣" == resp.data[i])
						$scope.changhuaChk = true;
					
					if ("南投縣" == resp.data[i])
						$scope.nantouChk = true;
					
					if ("雲林縣" == resp.data[i])
						$scope.yunlinChk = true;
					
					if ("嘉義縣" == resp.data[i])
						$scope.chiayi_cChk = true;
					
					if ("嘉義市" == resp.data[i])
						$scope.chiayiChk = true;
					
					if ("台南市" == resp.data[i])
						$scope.tainanChk = true;

					if ("高雄市" == resp.data[i])
						$scope.kaohsiungChk = true;

					if ("屏東縣" == resp.data[i])
						$scope.pingtungChk = true;

					if ("宜蘭縣" == resp.data[i])
						$scope.ilanChk = true;

					if ("花蓮縣" == resp.data[i])
						$scope.hualienChk = true;
					
					if ("台東縣" == resp.data[i])
						$scope.taitungChk = true;
				}
				$scope.visual = false;
			});
		};
		
		$scope.doMyself = function(){
			$scope.visual = true;
		};
		
		$scope.check = function(){
			var countChk = 0;
			var chkList = [];
			$('input[type=checkbox]').each(function () {
				if (this.checked){
					countChk++;
					chkList.push(this.value);
				}
			});
			if (countChk == count)
				$scope.visual = false;
			else if (countChk > count){
				var alert = $window.confirm('選擇居住的縣市大於所選環島天數');
				if (alert) {
					$scope.visual = false;
					$scope.day = parseInt(countChk)+1;
				}
			}else{
				var alert = $window.confirm('選擇居住的縣市小於所選環島天數');
				if (alert) {
					$scope.visual = false;
					$scope.day = parseInt(countChk)+1;
				}
			}
		};	
	});
})();