package com.cn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @author: shimingming
 * @create: 2019-02-20
 * @description:
 **/
@Controller
@Slf4j
public class testController {

    @RequestMapping("/time")
    @ResponseBody
    public String time() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        String format = simpleDateFormat.format(new Date());
        log.info(format);
        return format;

    }

    /**
     * 本地访问内容地址 ：http://localhost:8080/lmycc/hello
     *
     * @param map
     * @return
     */
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/index";
    }
}
