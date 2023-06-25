package com.example.apple.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.BuyFundMapper;
import com.example.apple.model.entity.BuyFund;
import com.example.apple.model.view.ClientFundView;
import com.example.apple.service.BuyFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BuyFundService
 * Package: com.example.apple.service.impl
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 16:37
 * @Version 1.0
 */
@Service
public class BuyFundServiceImpl extends ServiceImpl<BuyFundMapper, BuyFund> implements BuyFundService {
    @Autowired
    private BuyFundMapper buyFundMapper;
    public List<ClientFundView> clientFundList(Integer id){
        List<ClientFundView> clientProperty = buyFundMapper.getClientProperty(id);
        return clientProperty;
    }
}
