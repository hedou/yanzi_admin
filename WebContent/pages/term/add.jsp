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
		action="${pageContext.request.contextPath}/term_addTerm.action"
		method="post" enctype="multipart/form-data">
		
		
		
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>为课程添加学期</STRONG> </strong></td>
			</tr>
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Title 标题</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="Title" value="" />
				</td>

			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Brief 简介</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="Brief" value="" />
				</td>

			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Term 学期</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="term" value="" />
				</td>

			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Image 图片</td>
				<td class="ta_01" bgColor="#ffffff"><input type="file" style="height: 40px; width: 700px;"
					name="upload" value="" />
				</td>

			</tr>
			
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Desc 描述</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="TDesc" value="" />
				</td>

			</tr>
			
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Index 序号</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="Index"
					value="" /></td>
			</tr>
			
			
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Price 价格</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="Price"
					value="" /></td>

			</tr>		
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Discount 打折</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="Discount"
					value="" /></td>
			</tr>			
				<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					StartTime 开始时间</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="datetime-local" name="StartTime"
					value="" /></td>
			</tr>
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					EndTime 结束时间</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="datetime-local" name="EndTime"
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