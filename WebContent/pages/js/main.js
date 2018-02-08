
   // JavaScript Document
$(function(){
	
	var pagename2=$(".fwmain_nright .label .label_title").html();
	//alert(pagename2);
	$("#ulMenu li a").removeClass("cur");
	
	if(pagename2=="政府简介"||pagename2=="省长致辞"||pagename2=="领导介绍"){
		$("#ulMenu li:eq(1) a").addClass("cur");
	}else if(pagename2=="新闻动态"){
		$("#ulMenu li:eq(2) a").addClass("cur");
	}else if(pagename2=="公告栏"){
		$("#ulMenu li:eq(3) a").addClass("cur");
	}else if(pagename2=="意见反馈"){
		$("#ulMenu li:eq(4) a").addClass("cur");
	}else if(pagename2=="领导邮箱"){
		$("#ulMenu li:eq(5) a").addClass("cur");
	}else if(pagename2=="联系我们"){
		$("#ulMenu li:eq(6) a ").addClass("cur");
	}else {
		$("#ulMenu li:eq(0) a").addClass("cur");
	}
});
