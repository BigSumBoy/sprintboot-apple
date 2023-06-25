package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
/**
 * ClassName: ThymeleafController
 * Package: com.example.web
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/19 15:12
 * @Version 1.0
 */
@Controller
public class ThymeleafController {
    
    
    @RequestMapping(value = "/springboot/thymeleaf/index")
    public String index(Model model) {
        
        model.addAttribute("data","哈喽，SpringBoot");
        
        return "index";
    }
    
}