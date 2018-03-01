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
	<form  name="Form1"
		action="${pageContext.request.contextPath}/question_update.action"
		method="post">
		
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>编辑问题</STRONG> </strong></td>
			</tr>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Valid 上下线</td>
				<td bgColor="#ffffff" height="40%"><%-- <input
					 type="text" name="Valid"
					value="<s:property value="model.Valid"/>" /> --%>
					<select name="Valid" id="Valid">
				      	<%String m=String.valueOf(request.getAttribute("questionValid")); %>
				    	<option value ="0" <%="0".equals(m)?"selected":"" %>>上线</option>
  						<option value ="1" <%="1".equals(m)?"selected":"" %>>下线</option>
				    </select>
					</td>
			</tr>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Index 序号</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="Index"
					value="<s:property value="model.Index"/>" /></td>
			</tr>
			<%-- <tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					CorrectId 正误</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="CorrectId"
					value="<s:property value="model.CorrectId"/>" /></td>
			</tr> --%>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Type 类型</td>
				<td bgColor="#ffffff" height="40%">
				<%-- <input
					 type="text" name="Type"
					value="<s:property value="model.Type"/>" /> --%>
					<select name="Type" >
				      	<%String n=String.valueOf(request.getAttribute("questionType")); %>
				    	<option value ="1" <%="1".equals(n)?"selected":"" %>>填空</option>
  						<option value ="2" <%="2".equals(n)?"selected":"" %>>选择</option>
  						<option value ="3" <%="3".equals(n)?"selected":"" %>>匹配</option>
  						<option value ="4" <%="4".equals(n)?"selected":"" %>>对话</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					JsonContent json内容</td>
				<td class="ta_01" bgColor="#ffffff">
				    <%-- <input style="height: 40px; width: 700px;" type="text"
					name="JsonContent" value="<s:property value="model.JsonContent"/>"
					/> --%>
					<textarea rows="20" cols="80" name="JsonContent"><s:property value="model.JsonContent"/></textarea>
				</td>
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