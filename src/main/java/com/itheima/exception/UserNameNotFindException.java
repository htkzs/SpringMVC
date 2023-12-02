package com.itheima.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ClassName : UserNameNotFindException
 * @Description : 自定义异常
 * @Author : 20609
 * @Date: 2022/12/12  16:29
 */
@ResponseStatus(reason = "用户登录拒绝", value = HttpStatus.NOT_ACCEPTABLE)
public class UserNameNotFindException extends RuntimeException {

    private static final long serialVersionUID = 1286800777004095833L;
}
