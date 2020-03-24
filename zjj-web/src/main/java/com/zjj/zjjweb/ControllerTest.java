package com.zjj.zjjweb;

import com.zjj.zjjentity.domain.People;
import com.zjj.zjjservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String testsss(){
        return "hello";
    }

    @RequestMapping("/test1")
    public String getById(){
        People p = userService.findPeopleById(1);
        System.out.println(p.getPid()+"    "+p.getNam());
        return "ok";
    }

}
