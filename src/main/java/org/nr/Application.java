package org.nr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenhaiyang <690732060@qq.com>
 */
@Controller
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
