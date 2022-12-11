package com.itheima.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName : DownloadHandler
 * @Description : 处理文件的下载  测试URL http://localhost:8080/springmvc/download
 * @Author : 20609
 * @Date: 2022/12/11  21:55
 */
@Controller
public class DownloadHandler {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request) {
        //1。得到要下载的文件的流
        //找到文件的真实路径
        ServletContext context = request.getServletContext();
        String path = context.getRealPath("/scripts/jquery-1.9.1.min.js");
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            fileInputStream.close();
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("Content-Disposition", "attachment;filename=jquery-1.9.1.min.js");
            //将下载的文件流返回 public ResponseEntity(@Nullable T body, @Nullable MultiValueMap<String, String> headers, HttpStatus status)
            return new ResponseEntity<byte[]>(bytes, httpHeaders, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
