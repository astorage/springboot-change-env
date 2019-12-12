package com.java.changeenvironment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.env.desc}")
    private String env;

    @Value("${test.env.desc1}")
    private String env1;

    @Value("${test.env.desc2}")
    private String env2;

    @RequestMapping("/test")
    public String test(){
        return env + "\n" + env1 + "\n" + env2;
    }

}
