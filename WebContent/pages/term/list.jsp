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

	<div style="text-align:right;"><a  href="${pageContext.request.contextPath}/pages/term/add.jsp?">
	<input type="button" name="test" value="添加"/></a>
	</div>
	<form id="Form1" name="Form1"
		action=""
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>期数列表</strong>
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

								<td align="center" width="2%">期数ID</td>
								<td align="center" width="7%">课程标题</td>
								<td align="center" width="2%">Term 期数</td>
								<td align="center" width="7%">课程简介</td>
								<td align="center" width="4%">Index 序号</td>
								<td align="center" width="5%">原价</td>
								<td align="center" width="6%">折扣价</td>
								<td align="center" width="7%">副标题</td>
								<td align="center" width="6%">Image 图片</td>
								<td align="center" width="6%">Image2 图片2</td>
								
								<td align="center" width="4%">Valid 上下线</td>
								<td align="center" width="6%">StartTime 开始时间</td>
								<td align="center" width="6%">EndTime 结束时间</td>
								<td align="center" width="6%">AddTime 添加时间</td>
								<td align="center" width="6%">UpdateTime 更新时间</td>
								<td width="5%" align="center">编辑</td>
								<td width="5%" align="center">删除</td>
								<td width="5%" align="center">上传到真实库</td>
							</tr>
							<s:iterator var="u" value="termList" status="status">
							<s:if test="#u.Deletes == 0">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="3%"><s:property value="#u.t_Id" />
									</td>
						
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="7%">
										
										<a style="display:inline-block;
                width:100%; height:100%; " href="${ pageContext.request.contextPath }/lesson_findLessonListByTermId.action?t_Id=<s:property value="#u.t_Id"/>">
										<s:property value="#u.Title" />
										</a>
										</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="3%"><s:property value="#u.term" />
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="7%"><s:property value="#u.Brief" />
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="3%">
										<s:property value="#u.Index" />
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="5%">
										<s:property value="#u.Price" />
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="7%">
										<s:property value="#u.Discount" />
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="7%">
										<s:property value="#u.TDesc" />
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="7%">
										<img alt="" style="height:50px; width:50px;" src="<s:property value="#u.Image" />">
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="7%">
										<img alt="" style="height:50px; width:50px;" src="<s:property value="#u.Image2" />">
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="left" width="5%">
										<s:property value="#u.Valid" />
									</td>
									
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="6%"><s:property value="%{getText('{0,date,yyyy-MM-dd}',{#u.StartTime})}" />
									</td>
									
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="6%"><s:property value="%{getText('{0,date,yyyy-MM-dd}',{#u.EndTime})}" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="6%"><s:property value="%{getText('{0,date,yyyy-MM-dd}',{#u.AddTime})}" /></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="6%"><s:property value="%{getText('{0,date,yyyy-MM-dd}',{#u.UpdateTime})}" /></td>
									<td align="center" style="HEIGHT: 22px">
									  <a href="${ pageContext.request.contextPath }/term_edit.action?t_Id=<s:property value="#u.t_Id"/>">
									     <img src="${pageContext.request.contextPath}/pages/images/i_edit.gif" border="0" style="CURSOR: hand"></a>
									</td>

									<td align="center" style="HEIGHT: 22px">
									<a onclick="return confirmDel()" href="${ pageContext.request.contextPath }/term_delete.action?t_Id=<s:property value="#u.t_Id"/>">
										<img src="${pageContext.request.contextPath}/pages/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
									</a>
									</td>
									
									<td align="center" style="HEIGHT: 22px">
										<s:if test="#u.Valid == 1 ">
											<a onclick="return confirmTerm()" href="javascript:tijiao(<s:property value="#u.t_Id"/>)" target="_blank">
												<img src="${pageContext.request.contextPath}/pages/images/icn.gif" width="16" height="16" border="0" style="CURSOR: hand">
											</a>
										</s:if>
									</td>
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
		function confirmTerm()
		{
			if(confirm('确定要执行此操作吗?')) 
			  { 
			    return true; 
			  } 
			  return false;
		}
		function tijiao(termId)
		{
			var id = prompt("请输入课程id");
			if(id ==''||id == null)
			{
				
				return;
			}
		else
			{
			window.open('http://m.yetter.cn/yanzi/sync/?action=sync_term&courseId='+id+'&termId='+termId,'_blank');
			}
			
		}
	</script>
	
</body>
</HTML>

