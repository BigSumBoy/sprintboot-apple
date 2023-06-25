package com.example.apple.controller;

import com.example.apple.model.entity.Client;
import com.example.apple.model.entity.Fund;
import com.example.apple.service.ClientService;
import com.example.apple.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * ClassName: AdminController
 * Package: com.example.apple.controller
 * Description:管理管理员页面的请求
 *
 * @Author zhou
 * @Create 2023/6/21 14:38
 * @Version 1.0
 */
@Controller
public class AdminController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private FundService fundService;
    /**
     * 管理员的首页面
     * @param
     * @return
     */
    @GetMapping("/admin/index")
    public String index(){
        return "adminIndex";
    }
    
    /**
     * 管理员查看所有用户的界面
     * @param map
     * @return
     */
    @GetMapping("/admin/client")
    public String indexFund(ModelMap map){
        List<Client> list = clientService.list();
        map.addAttribute("clientList",list);
        return "adminClient";
    }
    /**
     * 转发添加用户请求
     * @return 添加用户的界面
     */
    @GetMapping("/admin/addClient")
    public String addClient(){
        
        return "addClient";
    }
    
    /**
     * 根据id删除用户信息
     * @param id
     * @return 管理员查看所有用户信息的首页面
     */
    @GetMapping("/admin/deleteclient/{id}")
    public String deleteClient(@PathVariable("id") String id){
        clientService.removeById(id);
        return "redirect:/admin/client";
    }
    
    /**
     * 转发更新请求
     * @param id
     * @param map
     * @return
     */
    @RequestMapping("/admin/updateclient/{id}")
    public String updateClient(@PathVariable("id")String id, ModelMap map) {
        Client clien = clientService.getById(id);
        map.addAttribute("updatedClient",clien);
        return "updateClient";
    }
    
    /**
     * 添加用户
     * @param client
     * @return 管理员查看所有用户的首页面
     */
    @PostMapping("/admin/client/add")
    public String add(Client client){
        clientService.save(client);
        //返回首页面
        return "redirect:/admin/client";
    }
    
    /**
     * 更新用户
     * @param client
     * @return 管理员查看所有用户的首页面
     */
    @PostMapping("/admin/client/update")
    public String update(Client client){
        clientService.updateById(client);
        //返回首页面
        return "redirect:/admin/client";
    }
    
    /**
     * 管理员查看所有基金界面
     * @param map
     * @return
     */
    @GetMapping("/admin/fund")
    public String indexfund(ModelMap map){
        List<Fund> list = fundService.list();
        map.addAttribute("fundList",list);
        return "adminFund";
    }
    
    /**
     * 转发添加基金的请求
     * @return
     */
    @GetMapping("/admin/addFund")
    public String addFund(){
        return "addFund";
    }
    
    /**
     * 添加基金
     * @param fund
     * @return 管理员查看基金界面
     */
    @PostMapping("/admin/fund/add")
    public String add(Fund fund){
        fundService.save(fund);
        return "redirect:/admin/fund";
    }
    @RequestMapping("/admin/updatefund/{fid}")
    public String updateFund(@PathVariable("fid")String fid,ModelMap map){
        Fund fund = fundService.getById(fid);
        map.addAttribute("updatedFund",fund);
        return "updateFund";
    }
    /**
     * 更新基金信息
     * @param fund
     * @return
     */
    @PostMapping("/admin/fund/update")
    public String update(Fund fund){
        fundService.updateById(fund);
        return "redirect:/admin/fund";
    }
    @RequestMapping("/admin/deletefund/{fid}")
    public String deleteFund(@PathVariable("fid") String id){
        fundService.removeById(id);
        return "redirect:/admin/fund";
    }
}
