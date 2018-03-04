<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/pages/css/Style1.css"
	type="text/css" rel="stylesheet">
</HEAD>
<script type="text/javascript">

	</script>
<body>
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/term_update.action"
		method="post">
		<input type="hidden" name="id"
			value="<s:property value="model.id"/>" /> &nbsp;
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>编辑学期</STRONG> </strong></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Title 标题</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"style="height: 40px; width: 700px;"
					name="Title" value="<s:property value="model.Title"/>" />
				</td>

			</tr>

			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					Brief 简介</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="Brief" value="<s:property value="model.Brief"/>"
					/></td>
				
			</tr>
			
			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					Term 学期</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" style="height: 40px; width: 700px;"
					name="term" value="<s:property value="model.term"/>"
					/></td>
				
			</tr>
			
			<tr>
			<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Price 价格</td>
				<td class="ta_01" bgColor="#ffffff"><input  type="text"
					name="Price" value="<s:property value="model.Price"/>"
					/></td>
			</tr>
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Discount 打折</td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="text"
					name="Discount" value="<s:property value="model.Discount"/>"
					/></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					TDesc 描述</td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="text"
					name="TDesc" value="<s:property value="model.TDesc"/>"
					/></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Image 图片</td>
				<td class="ta_01" bgColor="#ffffff">
				   <%--  <input style="height: 40px; width: 700px;" type="text"
					name="Image" value="<s:property value="model.Image"/>"
					/> --%>
					<img alt="" style="height:50px; width:50px;" src="<s:property value="model.Image" />">
				</td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					StartTime 开始时间</td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="date"
					name="StartTime" value="<s:property value="%{getText('{0,date,yyyy-MM-dd}',{model.StartTime})}"/>"
					/></td>
			</tr>
				<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					EndTime 结束时间</td>
				<td class="ta_01" bgColor="#ffffff">
				    <input style="height: 40px; width: 700px;" type="date"
					name="EndTime"  value="<s:property value="%{getText('{0,date,yyyy-MM-dd}',{model.EndTime})}"/>"
					/>
				</td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Index 序号</td>
				<td class="ta_01" bgColor="#ffffff"><input style="height: 40px; width: 700px;" type="text"
					name="Index" value="<s:property value="model.Index"/>"
					/></td>
			</tr>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Valid 上下线</td>
				<td bgColor="#ffffff" height="40%">
				    <select name="Valid" id="Valid">
				      	<%String m=String.valueOf(request.getAttribute("termValid")); %>
				    	<option value ="0" <%="0".equals(m)?"selected":"" %>>上线</option>
  						<option value ="1" <%="1".equals(m)?"selected":"" %>>下线</option>
				    </select>
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