package com.zjj.zjjweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerMode {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String method1(@PathVariable Integer id){
        return "";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String method2(@RequestParam String userName){
        //@RequestBody 方法参数用这个可以转化成对象。
        return "";
    }

}
