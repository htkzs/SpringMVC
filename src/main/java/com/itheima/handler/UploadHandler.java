package com.itheima.handler;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName : UploadHandler
 * @Description : 文件上传
 * @Author : 20609
 * @Date: 2022/12/11  22:32
 */
@Controller
public class UploadHandler {
    @RequestMapping("/upload")
    public String fileUpload(@RequestParam("username") String userName,
                             @RequestParam("headerImg") MultipartFile uploadFile, Model model){
        System.out.println("上传表单的字段名称为:"+uploadFile.getName());
        System.out.println("上传的文件名称为:"+uploadFile.getOriginalFilename());
        //保存文件
        try {
            uploadFile.transferTo(new File("D:\\java web\\"+uploadFile.getOriginalFilename()));
            model.addAttribute("msg","file upload success");
        } catch (IOException e) {
            model.addAttribute("msg","file upload failure");
            e.printStackTrace();
        }
        return "redirect:/success.jsp";
    }
}
