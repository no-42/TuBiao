<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="canvas"></div>
<script src="http://g.tbcdn.cn/bui/acharts/1.0.32/acharts-min.js"></script>
<!-- https://g.alicdn.com/bui/acharts/1.0.29/acharts-min.js -->

<script type="text/javascript">
var chart = new AChart({
    theme : AChart.Theme.Smooth2,
    id : 'canvas',
    width : 350,
    height : 300,
    legend : null ,//不显示图例
    seriesOptions : { //设置多个序列共同的属性
      pieCfg : {
        allowPointSelect : true,
        labels : {
          distance : 5, //文本距离圆的距离
          label : {
             show:true,
             position:'inner',
             
          },
          renderer : function(value,item){ //格式化文本
            return value + ' ' + (item.point.percent * 100).toFixed(2)  + '%';
          }
        },
        innerSize : '60%' //内部的圆，留作空白
      }
    },
    tooltip : {
      pointRenderer : function(point){
        return (point.percent * 100).toFixed(2)+ '%';
      }
    },
    series : [{
        type: 'pie',
        name: 'Browser share',
        data: ${data}
    }]
  });

  chart.render();
</script>
