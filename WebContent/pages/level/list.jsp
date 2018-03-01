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

	<div style="text-align:right;"><a  href="${pageContext.request.contextPath}/pages/level/add.jsp">
	<input type="button" name="test" value="添加"/></a>
	</div>
	<form id="Form1" name="Form1"
		action=""
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>勋章列表</strong>
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

								<td align="center" width="7%">LevelId 勋章号</td>
								<td align="center" width="10%">Title 标题</td>
								<td align="center" width="10%">Level 勋章</td>
								<td align="center" width="25%">Image 图片</td>
                                <td align="center" width="10%">MinExp 最小积分</td>
                                <td align="center" width="10%">Coin 勋币</td>
								<td align="center" width="5%">Valid 上下线</td>
								<td align="center" width="15%">AddTime 添加时间</td>
								<td align="center" width="15%">UpdateTime 更新时间</td>
								<td width="7%" align="center">编辑</td>
								<td width="7%" align="center">删除</td>
							</tr>
							<s:iterator var="u" value="levelList" status="status">
							<s:if test="#u.Valid == 0">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="3%"><s:property value="#u.LevelId" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="10%">
												<s:property value="#u.course.Title" />
										</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="10%"><s:property value="#u.Level" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="25%"><img alt="" style="height:50px; width:50px;" src="<s:property value="#u.Image" />"></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="5%">
										<s:property value="#u.MinExp" />
									</td>	
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="5%">
										<s:property value="#u.Coin" />
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="5%">
										<s:property value="#u.Valid" />
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15%"><s:property value="#u.AddTime" /></td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15%"><s:property value="#u.UpdateTime" /></td>
									<td align="center" style="HEIGHT: 22px"><a
										href="${ pageContext.request.contextPath }/level_edit.action?LevelId=<s:property value="#u.LevelId"/>">
											<img
											src="${pageContext.request.contextPath}/pages/images/i_edit.gif"
											border="0" style="CURSOR: hand">
									</a></td>

									<td align="center" style="HEIGHT: 22px"><a
										href="${ pageContext.request.contextPath }/level_delete.action?LevelId=<s:property value="#u.LevelId"/>">
											<img
											src="${pageContext.request.contextPath}/pages/images/i_del.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
									</a></td>
								</tr>
								</s:if>
							</s:iterator>
						</table>
					</td>
				</tr>
			</TBODY>
		</table>
	</form>
</body>
</HTML>

