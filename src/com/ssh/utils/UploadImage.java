package com.ssh.utils;

import java.io.IOException;
import java.util.UUID;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

public class UploadImage {
	
	

	    private static final String ACCESS_KEY = "WTplbwbHC65heurdCiCSy4N_WHvfvgw7rNeKgCOW";
	    private static final String SECRET_KEY = "Z86FgQpTVFUO_5gXK5RkleGXwned1OWyfzZY_fQd";
	    private static final String URL_PREFIX = "http://qiniu.image.yetter.cn/";
	    private static final int TOKEN_EXPRIES = 5 * 60;
	    private static final String BUCKET = "yetter";

	    private Auth auth;
//	   public static void main(String[] args) throws IOException {
//		   new UploadImage().upload("default/","D://image//1.jpg",".jpg");
//	   }
	    public String getUpToken() {
	        //密钥配置
	        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
	        return auth.uploadToken(BUCKET);
	    }
	    public String upload(String path,String FilePath,String prefix) throws IOException {
	            //第二种方式: 自动识别要上传的空间(bucket)的存储区域是华东、华北、华南。
	            Zone z = Zone.autoZone();
	            Configuration c = new Configuration(z);
	            //创建上传对象
	            UploadManager uploadManager = new UploadManager(c);

	            //上传到七牛后保存的文件名
	            String key = path + UUID.randomUUID() + prefix;
	            //上传文件的路径
	            Response res = null;
	            try {
	                //调用put方法上传
	                res = uploadManager.put(FilePath, key, getUpToken());
	                //打印返回的信息
	                System.out.println(res.bodyString());
	            } catch (QiniuException e) {
	                Response r = e.response;
	                //响应的文本信息
	                System.out.println(r.bodyString());
	            }
	            String jsonString = res.bodyString();
	            JSONObject jsonObject = JSON.parseObject(jsonString);
	            String img = jsonObject.getString("key");
	            String url = URL_PREFIX + img;
	            System.out.println(url);
	            return url;
	    }
}
