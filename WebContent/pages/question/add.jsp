<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/pages/css/Style1.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery-1.8.0.min.js"
</HEAD>

<body>
	<div width="30%" style="float:left" >
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加问题图片</STRONG> </strong></td>
			</tr>
			<tr>
				<td><input type="text" placeholder="输入标题" /></td>
				<td><input type="text" placeholder="上传图片"/></td>
			 </tr>
		 	<tr><td><input type="button" value="上传" /></td></tr>
		 </table>
	</div>

	<div width="70%" height="100%" style="float:right">
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/question_addQuestion.action"
		method="post">
	
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加题目</STRONG> </strong></td>
			</tr>

			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Index：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" 
					name="Index" value="" />
				</td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					CorrectId：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" 
					name="CorrectId" value="" />
				</td>
			</tr>
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Valid：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" 
					name="Valid" value="" />
				</td>
			</tr>
				
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					AddTime</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="datetime" name="AddTime"
					value="" /></td>

			</tr>
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					UpdateTime</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="datetime" name="UpdateTime"
					value="<s:property value=""/>" /></td>

			</tr>
			
					
			<tr>
			<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					JsonContent</td>
				<td class="ta_01" bgColor="#ffffff">
				<input style="height: 200px; width: 700px;" type="text"
					name="JsonContent" value=""/>
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
	</div>
</body>
<script type="text/javascript">

</script>
</HTML>