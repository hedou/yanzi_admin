<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/pages/css/left.css"
	rel="stylesheet" type="text/css" />
<link rel="StyleSheet"
	href="${pageContext.request.contextPath}/pages/css/dtree.css" type="text/css" />
</head>
<body>
	<table width="100" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="12"></td>
		</tr>
	</table>
	<table width="100%" border="0">
		<tr>
			<td>
				<div class="dtree">

					<a href="javascript: d.openAll();">展开所有</a> | <a
						href="javascript: d.closeAll();">关闭所有</a>

					<script type="text/javascript"
						src="${pageContext.request.contextPath}/pages/js/dtree.js"></script>
					<script type="text/javascript">
		
		d = new dTree('d');
		d.add('01',-1,'课程列表','${pageContext.request.contextPath}/course_findCourseListByPage.action?currentPage=1','','mainFrame');
	    d.add('02',-1,'勋章列表','${pageContext.request.contextPath}/level_findLevelListByPage.action?currentPage=1','','mainFrame'); 
		
		
		
		document.write(d);
	
	</script>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>
