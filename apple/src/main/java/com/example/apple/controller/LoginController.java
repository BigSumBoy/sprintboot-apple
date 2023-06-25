package com.example.apple.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.apple.model.entity.Client;
import com.example.apple.service.AdminService;
import com.example.apple.service.ClientService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Wrapper;

/**
 * ClassName: IndexController
 * Package: com.example.apple.controller
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 21:02
 * @Version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private AdminService adminService;
    
    /**
     * 转发请求至登陆验证界面
     * @return "login"
     */
    @GetMapping("/")
    public String welcome(){
        return "login";
    }
    
    /**
     * 验证账号密码
     * @param account
     * @param password
     * @return 管理员界面或用户界面，都不正确返回登陆界面
     */
    @PostMapping("verify")
    public String verify( @RequestParam("account")String account, @RequestParam("password") String password, HttpSession session){
        //验证是否时管理员
        if(adminService.verify(account,password)){
            return "redirect:/admin/index";
        }
        //不是管理员，验证是否是普通用户
        else{
            //如果查到了记录，会话中保存用户ID
            String id = clientService.verifyPassword(account,password);
            if (id != null) {
                session.setAttribute("loginId", id);
                return "redirect:/client/index";
            }
        }
        //都不正确，请求中添加错误信息，返回登陆界面
        session.setAttribute("msg","账号或者密码错误请重新登陆");
        return "login";
    }
}
