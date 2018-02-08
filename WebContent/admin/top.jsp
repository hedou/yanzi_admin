<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
BODY {
	MARGIN: 0px;
	BACKGROUND-COLOR: #ffffff
}

BODY {
	FONT-SIZE: 12px;
	COLOR: #000000
}

TD {
	FONT-SIZE: 12px;
	COLOR: #000000
}

TH {
	FONT-SIZE: 12px;
	COLOR: #000000
}
</style>
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css">
</HEAD>
<body>
	<table width="100%" height="70%" border="0" cellspacing="0"
		cellpadding="0">
		<tr>


			<td align="center" width="100%"
				background="${pageContext.request.contextPath}/images/adminbg.jpg">
				<div style="color: white; font-size: 40px;">雁字后台录入管理系统</div>
			</td>
		</tr>
	</table>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="30" valign="bottom"
				background="${pageContext.request.contextPath}/images/mis_01.jpg">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="85%" align="left">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color="#000000">
						</font>
						</td>
						<td width="15%">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>

									<td width="155" valign="bottom">用户名： <font color="blue"><s:property
												value="#session.existAdminUser.username" /></font>
									</td>
									<td width="10" align="right"><img width="6"
										height="18"></td>
								</tr>
							</table>
						</td>
						<td align="right" width="5%"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</HTML>
