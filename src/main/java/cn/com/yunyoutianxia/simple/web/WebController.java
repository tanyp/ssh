package cn.com.yunyoutianxia.simple.web;

import cn.com.yunyoutianxia.simple.service.local.WebService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanyp on 2019/3/19
 */
@RestController
public class WebController {
    private static final Logger logger = LogManager.getLogger("web");
    @Autowired
    private WebService ws;

    @GetMapping("/index")
    public String index(){
        logger.info("Hello, World!");
        ws.index();
        return "Hello 悠哉大王的日常";
    }

    @GetMapping("/save")
    public String save(){
        ws.save();
        return "Save 悠哉大王的日常";
    }

}
