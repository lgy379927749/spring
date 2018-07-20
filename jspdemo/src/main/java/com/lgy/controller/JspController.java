package com.lgy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//整合JSP
@Controller
public class JspController {
    @RequestMapping("/jspIndex")
    public String jspIndex(){
        return "jspIndex";
    }
    @RequestMapping("/index")
    public String Index(){
        return "jsp";
    }
}
