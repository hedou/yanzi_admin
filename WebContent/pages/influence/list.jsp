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

	<div style="text-align:right;"><a  href="${pageContext.request.contextPath}/pages/influence/add.jsp">
	<input type="button" name="test" value="添加"/></a>
	</div>
	<form id="Form1" name="Form1"
		action=""
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>影响力榜单</strong>
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

								<td align="center" width="12%">InfluenceId 榜单号</td>
								<td align="center" width="12%">num 第几期</td>
								<td align="center" width="12%">name 名字</td>
								<td align="center" width="12%">StartTime 开始时间</td>
                                <td align="center" width="12%">EndTime 结束时间</td>
								<td align="center" width="12%">Valid 上下线</td>
								<td width="12%" align="center">编辑</td>
								<td width="12%" align="center">删除</td>
							</tr>
							<s:iterator var="u" value="pageBean.list" status="status">
							<s:if test="#u.Deletes == 0">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="12%"><s:property value="#u.InfluenceId" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="12%">
												<s:property value="#u.num" />
										</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="12%"><s:property value="#u.name" /></td>
			
									
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="12%"><s:property value="%{getText('{0,date,yyyy-MM-dd}',{#u.StartTime})}" /></td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="12%"><s:property value="%{getText('{0,date,yyyy-MM-dd}',{#u.EndTime})}" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="12%">
										<s:property value="#u.Valid" />
									</td>
									<td align="center" style="HEIGHT: 22px"><a
										href="${ pageContext.request.contextPath }/influence_edit.action?InfluenceId=<s:property value="#u.InfluenceId"/>">
											<img
											src="${pageContext.request.contextPath}/pages/images/i_edit.gif"
											border="0" style="CURSOR: hand">
									</a></td>

									<td align="center" style="HEIGHT: 22px"><a onclick="return confirmDel()"
										href="${ pageContext.request.contextPath }/influence_delete.action?InfluenceId=<s:property value="#u.InfluenceId"/>">
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
	<script type="text/javascript">
		function confirmDel()
		{
			 if(confirm('确定要执行此操作吗?')) 
			  { 
			    return true; 
			  } 
			  return false; 
		}
	</script>
</body>
</HTML>

