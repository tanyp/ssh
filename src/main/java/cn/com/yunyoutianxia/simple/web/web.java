package cn.com.yunyoutianxia.simple.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanyp on 2019/3/19
 */
@RestController
public class web {

    @GetMapping("/index")
    public String index(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        return "Hello 悠哉大王的日常";
    }


}
