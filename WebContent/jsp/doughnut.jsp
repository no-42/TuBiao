<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Doughnut Chart</title>
<script src="http://localhost:8080/TuBiao/dist/Chart.min.js"></script>
<script src="http://localhost:8080/TuBiao/utils.js"></script>
<style>
canvas {
	-moz-user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}
</style>
</head>

<body>
	<div id="canvas-holder" style="width: 100%">
		<canvas id="chart-area"></canvas>
	</div>
	<script>
		var config = {
			type : 'doughnut',
			data : {
				datasets : [ {
					data :${number},
					backgroundColor : [ 'rgb(0,255,0)', 'rgb(255,255,0',
							'rgb(255,128,0)', 'rgb(255,0,0)', 'rgb(193,0,193)',
							'rgb(130,0,0)', ],
					label : 'Dataset 1'
				} ],
				labels : [ '良好', '中等', '对敏感人群不健康', '不健康', '非常不健康', '有毒害' ]
			},
			options : {
				responsive : true,
				legend : {
					position : 'right',
				},
				animation : {
					animateScale : true,
					animateRotate : true
				}
			}
		};

		window.onload = function() {
			var ctx = document.getElementById('chart-area').getContext('2d');
			window.myDoughnut = new Chart(ctx, config);
		};
	</script>
</body>
</html>