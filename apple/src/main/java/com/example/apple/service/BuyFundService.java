package com.example.apple.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apple.model.entity.BuyFund;
import com.example.apple.model.view.ClientFundView;

import java.util.List;

/**
* ClassName: BuyFundService
* Package: com.example.apple.service
* Description:
* @Author zhou
* @Create 2023/6/20 16:09
* @Version 1.0
*/
public interface BuyFundService extends IService<BuyFund> {
    List<ClientFundView> clientFundList(Integer id);
}
