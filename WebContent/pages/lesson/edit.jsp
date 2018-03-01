<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/pages/css/Style1.css"
	type="text/css" rel="stylesheet">
</HEAD>

<body>
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/lesson_update.action"
		method="post">
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>编辑关卡</STRONG> </strong></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Title 标题</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"  style="height: 40px; width: 700px;"
					name="Title" value="<s:property value="model.Title"/>" />
				</td>
			</tr>

			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					Index 序号</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="Index" value="<s:property value="model.Index"/>"
					/></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					StartTime 开始时间</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="datetime-local" name="StartTime"
					value="<s:property value="model.StartTime"/>" /></td>
			</tr>
			<tr>
			<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Image 图片</td>
				<td class="ta_01" bgColor="#ffffff">
				   <%-- <input style="height: 40px; width: 700px;" type="text"
					name="Image" value="<s:property value="model.Image"/>"
					/> --%>
					<img alt="" style="height:50px; width:50px;" src="<s:property value="model.Image" />">
				</td>
			</tr>
			
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Valid 上下线</td>
				<td bgColor="#ffffff" height="40%">
					<select name="Valid" id="Valid">
				      	<%String m=String.valueOf(request.getAttribute("lessonValid")); %>
				    	<option value ="0" <%="0".equals(m)?"selected":"" %>>上线</option>
  						<option value ="1" <%="1".equals(m)?"selected":"" %>>下线</option>
				    </select>			
				</td>

			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					PrimerTitle</td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="text"
					name="PrimerTitle" value="<s:property value="model.PrimerTitle"/>"
					/></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					PrimerBrief</td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="text"
					name="PrimerBrief" value="<s:property value="model.PrimerBrief"/>"
					/></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					PrimerImage</td>
				<td class="ta_01" bgColor="#ffffff">
				    <%-- <input style="height: 40px; width: 700px;" type="text"
					name="Image" value="<s:property value="model.PrimerImage"/>"
					/> --%>
					<img alt="" style="height:50px; width:50px;" src="<s:property value="model.PrimerImage" />">
				</td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					PrimerContent </td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="text"
					name="PrimerContent" value="<s:property value="model.PrimerContent"/>"
					/></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					SummaryImage 总结图片</td>
				<td class="ta_01" bgColor="#ffffff">
				     <%--  <input style="height: 40px; width: 700px;" type="text"
					name="SummaryImage" value="<s:property value="model.SummaryImage"/>"
					/> --%>
					<img alt="" style="height:50px; width:50px;" src="<s:property value="model.SummaryImage" />">
				</td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					SummaryContent </td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="text"
					name="SummaryContent" value="<s:property value="model.SummaryContent"/>"
					/></td>
			</tr>
			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4">
					<button type="submit" value="确定"
						class="button_ok">&#30830;&#23450;</button> <FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					<button type="reset" value="重置" class="button_cancel">&#37325;&#32622;</button>

					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT> <INPUT
					class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
					<span id="Label1"></span>
				</td>
			</tr>
		</table>
	</form>
</body>
</HTML>