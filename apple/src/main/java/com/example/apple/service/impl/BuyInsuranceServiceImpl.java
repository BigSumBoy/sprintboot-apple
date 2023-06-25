package com.example.apple.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.BuyInsuranceMapper;
import com.example.apple.model.entity.BuyInsurance;
import com.example.apple.service.BuyInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: BuyInsuranceServiceImpl
 * Package: com.example.apple.service.impl
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 16:41
 * @Version 1.0
 */
@Service
public class BuyInsuranceServiceImpl extends ServiceImpl<BuyInsuranceMapper, BuyInsurance> implements BuyInsuranceService {
    @Autowired
    private BuyInsuranceMapper buyInsuranceMapper;
}
