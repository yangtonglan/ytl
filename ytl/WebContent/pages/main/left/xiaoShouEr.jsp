<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/css/new_file.css">
		<script src="${pageContext.request.contextPath}/pages/js/pie.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jQuery.js"></script>
		<title>销量额分析</title>
		<style type="text/css">
		body{background:url(../../images/ti2.jpg);}
		</style>
</head>
<body>
     <h1>2018年6月</h1>
		<div id="my_container" style="width:600px; height:500px; margin-left: 600px;margin-top: -30px;">
			<canvas id="pie_canvas"></canvas>
		</div>
		<div class="tab_width">
			<b class="t1"></b><b class="t2"></b><b class="t3"></b><b class="t4"></b>
			<div class="tab">
				<table>
				<thead>
					<tr>
						<td>产品名称</td>
						<td>销售数量</td>
						<td>单价</td>
						<td>销售额</td>
					</tr></thead>
					<tbody>
					<tr class="bg1">
						<td>U盘（金士顿）</td>
						<td>105</td>
						<td>60</td>
						<td>6300</td>
					</tr>
					<tr class="bg2">
						<td>U盘（东芝）</td>
						<td>80</td>
						<td>139</td>
						<td>11120</td>
					</tr>
					<tr class="bg1">
						<td>U盘（台电）</td>
						<td>126</td>
						<td>55</td>
						<td>6930</td>
					</tr>
					<tr class="bg2">
						<td>U盘（威刚）</td>
						<td>98</td>
						<td>75</td>
						<td>7350</td>
					</tr>
					<tr class="bg1">
						<td>U盘（PNY）</td>
						<td>45</td>
						<td>95</td>
						<td>4275</td>
					</tr>
					<tr class="bg2">
						<td>U盘（闪迪）</td>
						<td>78</td>
						<td>89</td>
						<td>6942</td>
					</tr>
					</tbody>
				</table>
			</div>
			<b class="b4"></b><b class="b3"></b><b class="b2"></b><b class="b1"></b>
		</div>
</body>
</html>