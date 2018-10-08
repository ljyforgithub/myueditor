package com.ljy.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;

@Controller
public class UpLoadController {
	
	private String httpPath = "https://tengdacity-1256881191.cos.ap-guangzhou.myqcloud.com/";
	
	@RequestMapping("upload")
	@ResponseBody
	public Map<String, Object> upload(HttpServletRequest req){
		
		Map<String, Object> result = new HashMap<String, Object>();
		MultipartHttpServletRequest mReq  =  null;
        MultipartFile file = null;
        InputStream is = null ;
        String fileName = "";
        // 原始文件名   UEDITOR创建页面元素时的alt和title属性
        String originalFileName = "";
        String filePath = "";
        
        try {
            mReq = (MultipartHttpServletRequest)req;
            // 从config.json中取得上传文件的ID
            file = mReq.getFile("upfile");
            // 取得文件的原始文件名称
            fileName = file.getOriginalFilename();
            File f = new File("D:\\images\\", fileName);
            originalFileName = fileName;
            if(!fileName.isEmpty()) {
            	file.transferTo(f);
            }
            COSCredentials cred = new BasicCOSCredentials("AKIDDKF4iBaXVHvSoywjKj6PXTDm9KJ6uHk2", "FJB0f8QXUFoDQSJyVv66vZ2KUim8SefU");
            ClientConfig clientConfig = new ClientConfig(new Region("ap-guangzhou"));
            COSClient cosclient = new COSClient(cred, clientConfig);
            String bucketName ="tengdacity-1256881191";
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName, f);
    		PutObjectResult putObjectResult = cosclient.putObject(putObjectRequest);
            result.put("state", "SUCCESS");// UEDITOR的规则:不为SUCCESS则显示state的内容
            result.put("url", httpPath + fileName);
            result.put("title", fileName);
            result.put("original", fileName);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            result.put("state", "文件上传失败!");
            result.put("url","");
            result.put("title", "");
            result.put("original", "");
            System.out.println("文件 "+fileName+" 上传失败!");
        }
		return result;
	}
}
