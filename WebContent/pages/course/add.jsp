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
		action="${pageContext.request.contextPath}/course_add.action"
		method="post">
		<input type="hidden" name="id"
			value="<s:property value=""/>" /> &nbsp;
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加课程</STRONG> </strong></td>
			</tr>

			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Title：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="Title" value="<s:property value="model.Title"/>" />
				</td>

			</tr>

			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					EnTitle</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="EnTitle" value=""/>
				</td>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Image</td>
				<td class="ta_01" bgColor="#ffffff">
				<input style="height: 40px; width: 700px;" type="text"
					name="Image" value=""/>
				</td>
			</tr>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Valid</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="Valid"
					value="" /></td>

			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					AddTime</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="AddTime"
					value="" /></td>

			</tr>
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					UpdateTime</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="UpdateTime"
					value="<s:property value=""/>" /></td>

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