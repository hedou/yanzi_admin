<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/pages/css/Style1.css"
	rel="stylesheet" type="text/css" />

</HEAD>
<body>
	<br>

	<div style="text-align:right;"><a  href="${pageContext.request.contextPath}/pages/course/add.jsp">
	<input type="button" name="test" value="添加"/></a>
	</div>
	<form id="Form1" name="Form1"
		action=""
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>课程列表</strong>
					</TD>
				</tr>
				<tr>

				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

								<td align="center" width="4%">ID</td>
								<td align="center" width="10%">Title</td>
								<td align="center" width="10%">EnTitle</td>
								<td align="center" width="25%">Image</td>

								<td align="center" width="5%">Valid</td>
								<td align="center" width="15%">AddTime</td>
								<td align="center" width="15%">UpdateTime</td>
								<td width="7%" align="center">编辑</td>
								<td width="7%" align="center">删除</td>
							</tr>
							<s:iterator var="u" value="pageBean.list" status="status">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="3%"><s:property value="#u.CourseId" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="10%">
										
										<a href="${ pageContext.request.contextPath }/term_findTermListByCourseId.action?CourseId=<s:property value="#u.CourseId"/>">
										<s:property value="#u.Title" />
										</a>
										</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="10%"><s:property value="#u.EnTitle" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="25%"><s:property value="#u.Image" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="5%">
										<s:property value="#u.Valid" />
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15%"><s:property value="#u.AddTime" /></td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15%"><s:property value="#u.UpdateTime" /></td>
									<td align="center" style="HEIGHT: 22px"><a
										href="${ pageContext.request.contextPath }/course_edit.action?id=<s:property value="#u.id"/>">
											<img
											src="${pageContext.request.contextPath}/pages/images/i_edit.gif"
											border="0" style="CURSOR: hand">
									</a></td>

									<td align="center" style="HEIGHT: 22px"><a
										href="${ pageContext.request.contextPath }/course_delete.action?id=<s:property value="#u.id"/>">
											<img
											src="${pageContext.request.contextPath}/pages/images/i_del.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
									</a></td>
								</tr>
							</s:iterator>
						</table>
					</td>
				</tr>
				<tr align="center">
					<td colspan="7">第<s:property value="pageBean.currentPage" />/<s:property
							value="pageBean.totalPage" />页 <s:if
							test="pageBean.currentPage != 1">
							<a
								href="${ pageContext.request.contextPath }/course_findCourseListByPage.action?currentPage=1">首页</a>|
								<a
								href="${ pageContext.request.contextPath }/courseadmin_findCourseListByPage.action?currentPage=<s:property value="pageBean.currentPage-1"/>">上一页</a>|
							</s:if> <s:if test="pageBean.currentPage != pageBean.totalPage">
							<a
								href="${ pageContext.request.contextPath }/course_findCourseListByPage.action?currentPage=<s:property value="pageBean.currentPage+1"/>">下一页</a>|
								<a
								href="${ pageContext.request.contextPath }/course_findCourseListByPage.action?currentPage=<s:property value="pageBean.totalPage"/>">尾页</a>|
							</s:if>
					</td>
				</tr>
			</TBODY>
		</table>
	</form>
</body>
</HTML>

