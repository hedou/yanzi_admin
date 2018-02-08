<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<head>
<title>雁字管理员登陆界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<style type="text/css">
body {
	color: white;
}
</style>·
</head>
<body
	<%-- style="background:url(${pageContext.request.contextPath}/images/adminbg.jpg) ">--%>
	<center>
		<s:actionerror />

	</center>
	<form method="post"
		action="${pageContext.request.contextPath }/adminUser_login.action"
		target="_parent" name='theForm'>
		<table cellspacing="0" cellpadding="0" style="margin-top: 100px"
			align="center">
			<tr>
				<td style="padding-left: 50px">
					<table>
						<tr>
							<td>管理员用户名：</td>
							<td><input type="text" name="username" /></td>
						</tr>
						<tr>
							<td>管&nbsp;理&nbsp;员&nbsp;密&nbsp;码：</td>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><input type="submit" value="进入管理中心" class="button" /></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<input type="hidden" name="act" value="signin" />
	</form>

</body>