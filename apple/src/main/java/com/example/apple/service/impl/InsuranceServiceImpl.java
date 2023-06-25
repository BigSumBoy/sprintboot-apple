package com.example.apple.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.InsuranceMapper;
import com.example.apple.model.entity.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Provider;

/**
 * ClassName: InsuranceServiceImpl
 * Package: com.example.apple.service.impl
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 16:30
 * @Version 1.0
 */
@Service
public class InsuranceServiceImpl extends ServiceImpl<InsuranceMapper, Insurance> {
    @Autowired
    private InsuranceMapper insuranceMapper;
    
}
