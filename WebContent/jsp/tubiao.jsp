<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<!-- <script type="text/javascript"
	src="${pageContext.request.contextPath}/js/boxsize.js"></script> -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/boxsize.css" />
</head>
<body>
	<div id="mainbox">
		<div id="toptext"></div>
		<div id="secondtoptext"></div>
		<div id="lefttopbox">
			<jsp:include page="canves.jsp">
				<jsp:param value='${data}' name="data" />
			</jsp:include>
		</div>
		<div id="leftbottombox">
			<jsp:include page="doughnut.jsp">
				<jsp:param value='${number }' name="number" />
			</jsp:include>
		</div>
		<div id="box"></div>
		<div id="secondbox"></div>
		<div id="righttopbox"></div>
		<div id="rightbottombox"></div>
	</div>
</body>
</html>