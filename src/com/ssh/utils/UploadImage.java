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
	
	

		private static final String ACCESS_KEY = "bMsxBlEhchY7vyVNBn8aZRMbQWNIITXd2oewsiQA";
	    private static final String SECRET_KEY = "B2hDo4x-wTlXcKfOUI9wnA3wrn9iGkqHtTV3eoQY";
	    private static final String URL_PREFIX = "http://qiniu.image.yetter.cn/";
	    private static final int TOKEN_EXPRIES = 5 * 60;
	    private static final String BUCKET = "yetter";

	    private Auth auth;
//	   public static void main(String[] args) throws IOException {
//		   new UploadImage().upload("default/","D://image//1.jpg",".jpg");
//	   }
	    public String getUpToken() {
	        //��Կ����
	        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
	        return auth.uploadToken(BUCKET);
	    }
	    public String upload(String path,String FilePath,String prefix) throws IOException {
	            //�ڶ��ַ�ʽ: �Զ�ʶ��Ҫ�ϴ��Ŀռ�(bucket)�Ĵ洢�����ǻ��������������ϡ�
	            Zone z = Zone.autoZone();
	            Configuration c = new Configuration(z);
	            //�����ϴ�����
	            UploadManager uploadManager = new UploadManager(c);

	            //�ϴ�����ţ�󱣴���ļ���
	            String key = path + UUID.randomUUID() + prefix;
	            //�ϴ��ļ���·��
	            Response res = null;
	            try {
	                //����put�����ϴ�
	                res = uploadManager.put(FilePath, key, getUpToken());
	                //��ӡ���ص���Ϣ
	                System.out.println(res.bodyString());
	            } catch (QiniuException e) {
	                Response r = e.response;
	                //��Ӧ���ı���Ϣ
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
