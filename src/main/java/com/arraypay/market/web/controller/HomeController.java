package com.arraypay.market.web.controller;

import com.arraypay.market.dto.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String hello(){
        return "hello admin";
    }

    @GetMapping("/user")
    @ResponseBody
    public String getList(){
        return "hello getList";
    }


    @PostMapping("/user")
    @ResponseBody
    public String save(){
        return "hello save";
    }


    @PutMapping("/user")
    @ResponseBody
    public String update(){
        return "hello update";
    }
}
