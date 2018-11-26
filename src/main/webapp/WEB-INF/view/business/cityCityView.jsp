<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@include file="/common/include/htmlDocType.html"%>
<html>
<head>
<title>城市显示页面</title>
<%@include file="/common/include/jspHeader.jsp"%>




</head>
<body>
	<div id="tabMyInfo"
		style="overflow: hidden; border: 1px solid #A3C0E8; position: relative;">
		<div title="编号" tabid="orgmesg">
		城市编号: ${cityEntity.id}</div>
		<div title="名称" tabid="orgmesgs">
		城市名称:${cityEntity.name}</div>
	</div>
</body>
</html>