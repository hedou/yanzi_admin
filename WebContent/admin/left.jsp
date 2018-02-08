<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/css/left.css"
	rel="stylesheet" type="text/css" />
<link rel="StyleSheet"
	href="${pageContext.request.contextPath}/css/dtree.css" type="text/css" />
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
						src="${pageContext.request.contextPath}/js/dtree.js"></script>
					<script type="text/javascript">
		
		d = new dTree('d');
		d.add('01',-1,'课程列表','${pageContext.request.contextPath}/course_findCourseListByPage.action?currentPage=1','','mainFrame');
		/* d.add('0101','01','新闻管理','','','mainFrame');
		d.add('010101','0101','新闻管理','${pageContext.request.contextPath}/newsadmin_findNewList.action?currentPage=1','','mainFrame');
		d.add('0102','01','公告管理','','','mainFrame');
		d.add('010201','0102','公告管理','${pageContext.request.contextPath}/noticeadmin_findNoticeList.action?currentPage=1','','mainFrame');
		d.add('0103','01','意见反馈管理');
		d.add('010301','0103','意见反馈管理','${pageContext.request.contextPath}/adviceadmin_findAdviceList.action?currentPage=1','','mainFrame');
		d.add('0104','01','领导信箱管理');
		d.add('010401','0104','领导信箱管理','${pageContext.request.contextPath}/leaderletteradmin_findLeaderLetterList.action?currentPage=1','','mainFrame'); */
		document.write(d);
	
	</script>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>
