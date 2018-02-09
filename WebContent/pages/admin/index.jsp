<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<head>
<title>雁字管理员登陆界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	
	<center>
		<s:actionerror />
	</center>
	
	<form method="post" action="${pageContext.request.contextPath }/adminUser_login.action">	
		<table>
			<tr>
				<td>管理员用户名：</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>管理员密码：</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
		
				<td><input type="submit" value="确定" class="button" /></td>
			</tr>
		</table>
	</form>
</body>
</html>