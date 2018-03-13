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
<div style="width:1000px">
	<div  style="float:left;width:300px"  >
		<table id="img_table" cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="1">
			<tr border="0">
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加问题图片</STRONG> </strong></td>
			</tr>
			<tr border="0">
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					<input type="text" placeholder="输入标题" name="img_title" /></td>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					<input type="file" placeholder="上传图片" name="file" id="file" multiple/></td>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
		 			<input id="upload_btn" type="button" value="上传" />
	 			</td>
			 </tr>
			 <tr>
			 	<td>
			 		
			 		<a href="http://39.104.85.167:8083" target="_Blank">json录入辅助</a>
			 	</td>
			 </tr>
		 </table>
		 
	</div>
	
	

	<div  height="100%" style="float:right;width:450px" >
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/question_addQuestion.action"
		method="post">
	
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加题目</STRONG> </strong></td>
			</tr>

			<!-- <tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					Index 序号</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" 
					name="Index" value="" />
				</td>
			</tr> -->
			<!-- <tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					CorrectId：正误</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" 
					name="CorrectId" value="" />
				</td>
			</tr> -->
			
			<tr>
				<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					题型</td>
				<td class="ta_01" bgColor="#ffffff">
				<select name="Type">
					<option value="1">填空</option>
					<option value="2">选择</option>
					<option value="3">匹配</option>
					<option value="4">对话</option>
				</select>
				<!-- <input type="text" 
					name="Type" value="" /> -->
				</td>
			</tr>
					
			<tr>
			<td width="10%" align="center" bgColor="#f5fafe" class="ta_01">
					问题字符串（json格式）</td>
				<td class="ta_01" bgColor="#ffffff">
				<!-- <input style="height: 200px; width: 700px;" type="text"
					name="JsonContent" value=""/> -->
				<textarea rows="40" cols="80" name="JsonContent">
					
				</textarea>
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
	</div>
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