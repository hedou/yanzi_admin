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
		action="${pageContext.request.contextPath}/level_addLevel.action"
		method="post" enctype="multipart/form-data">
	
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加勋章</STRONG> </strong></td>
			</tr>

			<!-- <tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					course：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="course" value="" />
				</td>

			</tr> -->

			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					Level 勋章(这里填的是数字)</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="Level" value=""/>
				</td>
				
			</tr>
			
			<tr>
			<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Image 图片</td>
				<td class="ta_01" bgColor="#ffffff">
				<input style="height: 40px; width: 700px;" type="file"
					name="upload" value=""/>
				</td>
			</tr>
			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					MinExp 最少积分</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="MinExp" value=""/>
				</td>
				
			</tr>
			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					Coin 勋币</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="Coin" value=""/>
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