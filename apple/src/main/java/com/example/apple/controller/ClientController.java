package com.example.apple.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.apple.model.entity.BuyFund;
import com.example.apple.model.entity.Client;
import com.example.apple.model.entity.Fund;
import com.example.apple.model.view.ClientFundView;
import com.example.apple.service.BuyFundService;
import com.example.apple.service.ClientService;
import com.example.apple.service.FundService;
import jakarta.servlet.http.HttpSession;
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
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: ClientController
 * Package: com.example.apple.controller
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/21 8:17
 * @Version 1.0
 */
@Controller
public class ClientController {
    @Autowired
    private BuyFundService buyFundService;
    @Autowired
    private FundService fundService;
    
    /**
     * 转发至用户首页面
     *
     * @return
     */
    @GetMapping("/client/index")
    public String clientIndex() {
        return "clientIndex";
    }
    
    /**
     * 转发至用户资产界面
     *
     * @return
     */
    @GetMapping("/client/property")
    public String clientProperty() {
        return "clientProperty";
    }
    @GetMapping("/client/property/fund")
    public String clientFund(ModelMap map, HttpSession session){
        //获取用户ID
        String loginId = (String) session.getAttribute("loginId");
        //基金购买记录表中查询
        List<ClientFundView> buyFundList = buyFundService.clientFundList(Integer.valueOf(loginId));
        map.addAttribute("buyFundList", buyFundList);
        return "clientPropertyFund";
    }
    /**
     * 转发至资产购买界面
     * @return
     */
    @GetMapping("/client/buy")
    public String clientBuy(){
        return "clientBuy";
    }
    
    /**
     * 转发至客户购买基金页面
     * @return
     */
    @GetMapping("/client/buy/fund")
    public String clientBuyFund(ModelMap map){
        //查询出所有基金
        List<Fund> allFund = fundService.list();
        //过滤掉下线的基金
        List<Fund> fundList = allFund.stream().filter(o -> o.getState().equals("上线")).toList();
        map.addAttribute("fundList",fundList);
        return "clientBuyFund";
    }
    @RequestMapping("/client/buy/fund/{fid}")
    public String buyFund(@PathVariable("fid")String fid,ModelMap map){
        Fund boughtFund = fundService.getById(fid);
        map.addAttribute("boughtFund",boughtFund);
        return "fundBought";
    }
    @PostMapping("/client/buy/fund/confirm/{fid}")
    public String buyFundConfirm(@PathVariable("fid") String fid, @RequestParam("pnum") String pnum,HttpSession session,ModelMap map){
        
        //购买记录写入数据库
        //用户ID
        String id = (String)session.getAttribute("loginId");
        //购买时间
        LocalDate now = LocalDate.now();
        BuyFund buyFund= new BuyFund();
        
        buyFund.setId(id);
        buyFund.setFid(fid);
        buyFund.setPnum(pnum);
        buyFund.setPtime(now.toString());
        
        buyFundService.save(buyFund);
        //返回
        return  "redirect:/client/buy/fund";
    }
    
}
