<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/pages/css/Style1.css"
	type="text/css" rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/ajaxfileupload.js"></script>
</HEAD>

<body>
<div  style="float:left;width:300px"  >
		<table id="img_table" cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="1">
			
			<tr border="0">
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					<input type="text" placeholder="输入标题" name="img_title" /></td>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					<input type="file" placeholder="上传图片" name="file" id="file" multiple/></td>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
		 			<input id="upload_btn" type="button" value="上传" />
	 			</td>
			 </tr>
			 
		 </table>
		 
	</div>
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/level_update.action"
		method="post">
		<input type="hidden" name="LevelId"
			value="<s:property value="model.LevelId"/>" /> &nbsp;
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>编辑勋章</STRONG> </strong></td>
			</tr>

			<%-- <tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					course：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="course" value="<s:property value="model.course.Title"/>" />
				</td>

			</tr> --%>

			<tr>
				<td width="9%" align="center" bgColor="#f5fafe" class="ta_01">
					Level 勋章</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="Level" value="<s:property value="model.Level"/>"
					/></td>
			</tr>
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Image 图片</td>
				<td class="ta_01" bgColor="#ffffff">
				    <input style="height: 40px; width: 700px;" type="text"
					name="Image" value="<s:property value="model.Image"/>"
					/>
					<%-- <img alt="" style="height:50px; width:50px;" src="<s:property value="model.Image" />"> --%>
				</td>
			</tr>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					MinExp 最少积分</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="MinExp"
					value="<s:property value="model.MinExp"/>" /></td>

			</tr>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Coin 勋币</td>
				<td bgColor="#ffffff" height="40%"><input
					 type="text" name="Coin"
					value="<s:property value="model.Coin"/>" /></td>

			</tr>
			<tr>
				<td width="5%" align="center" bgColor="#f5fafe" class="ta_01">
					Valid 上下线</td>
				<td bgColor="#ffffff" height="40%">
					<select name="Valid" id="Valid">
				      	<%String m=String.valueOf(request.getAttribute("levelValid")); %>
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
<script type="text/javascript">
	$(document).ready(function(){
		$("#upload_btn").click(function(){
			$("#upload_btn").attr("disabled",true);
			$.ajaxFileUpload({ 
                secureuri: false, //一般设置为false  
                fileElementId: 'file', //文件上传空间的id属性
                url:"questionImage.action",//需要用来处理ajax请求的action,excuteAjax为处理的方法名，JsonAction为action名
                data:{ 
                },
                dataType:"json",//设置需要返回的数据类型
                success:function(data){
                   console.log(data);
                   $("#upload_btn").attr("disabled",false);
                   var title = $("input[name=img_title]").val();
                   $("input[name=img_title]").val("");
                   $("#file").val("");
                   $("#img_table").append("<tr  width='10%' align='center' bgColor='#f5fafe' class='ta_01'><td>"+title+"</td><td width='10%' align='center' bgColor='#f5fafe' class='ta_01'>"+data.imgUrl+"</td></tr>")
                },
                error:function(XmlHttpRequest,textStatus, errorThrown)
                {
                	$("#upload_btn").attr("disabled",false);
               		 alert("上传失败;"+XmlHttpRequest.responseText);
                }
            });
		})
	})
</script>
</HTML>