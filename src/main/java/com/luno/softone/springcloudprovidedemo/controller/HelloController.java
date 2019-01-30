package com.luno.softone.springcloudprovidedemo.controller;

import com.luno.softone.springcloudprovidedemo.dto.HelloMessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: HelloController
 * @Reason: TODO ADD REASON(可选)
 * @date: 2018年12月19日 16:25
 * @company:
 * @since JDK 1.8
 */
@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Value("${name}")
    private String name;


    @GetMapping("/")
    public String home() {
        return "hello ....." + name;
    }


    @GetMapping("/message")
    public HelloMessageDTO getMessage() {

        log.info("收到请求啦。。。。");
        HelloMessageDTO helloMessage = new HelloMessageDTO();
        helloMessage.setName("张三");
        helloMessage.setMessage("你调用成功了。。。。");
        return helloMessage;
    }

}
