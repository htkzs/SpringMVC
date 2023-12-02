package com.itheima.handler;


import com.itheima.entity.Book;
import com.itheima.entity.Employee;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestBodyHandler {
    /*
     * @Author GhostGalaxy
     * @Description 测试接收一个JSON格式的数据 将这个数据封装在一个对象中
     * @Date 17:22:32 2022/12/11
     * @Param [employee]
     * @return java.lang.String
     **/
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("接受到POST请求的请求体为：" + body);
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description 测试接收一个JSON字符串 放到对象中
     * @Date 18:21:26 2022/12/11
     * @Param [employee]
     * @return java.lang.String
     **/
    @RequestMapping("/testRequestBody01")
    public String testRequestBody01(@RequestBody Employee employee) {
        System.out.println("接受到POST请求的请求体为：" + employee);
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description 得到整个请求头的信息 测试地址：http://localhost:8080/springmvc/testHttpEntity
     *
     *
     * @Date 18:24:44 2022/12/11
     * @Param [httpEntity]
     * @return java.lang.String
     **/
    @RequestMapping("/testHttpEntity")
    public String testHttpEntity(HttpEntity<String> httpEntity) {
        System.out.println(httpEntity);
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description 如果指定 @ResponseBody注解返回的字符串将会直接放到响应体中 不进行页面跳转 测试地址：http://localhost:8080/springmvc/testResponseBody
     * @Date 18:27:08 2022/12/11
     * @Param []
     * @return java.lang.String
     **/
    @ResponseBody
    @RequestMapping("/testResponseBody")
    public String testResponseBody() {
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description 定制响应体 测试地址：http://localhost:8080/springmvc/testResponseEntity
     * @Date 18:33:35 2022/12/11
     * @Param []
     * @return org.springframework.http.ResponseEntity<java.lang.String>
     **/
    @RequestMapping("/testResponseEntity")
    public ResponseEntity<String> testResponseEntity() {
        HttpStatus statusCode;
        String body = "<h1>success</h1>";
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("set-cookie", "username=韩梅梅");
        ResponseEntity<String> responseEntity = new ResponseEntity<>(body, headers, HttpStatus.OK);
        return responseEntity;
    }

}
