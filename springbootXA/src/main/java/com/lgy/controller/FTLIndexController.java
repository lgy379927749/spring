package com.lgy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

//整合freemarker
@Controller
public class FTLIndexController {
    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String,Object> map){
        map.put("name","小小");
        map.put("age",18);
        map.put("sex","0");
     return "ftlIndex";
    }
}
