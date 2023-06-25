package com.example.apple.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.FundMapper;
import com.example.apple.model.entity.Fund;
import com.example.apple.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: FundServiceImpl
 * Package: com.example.apple.service.impl
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 16:28
 * @Version 1.0
 */
@Service
public class FundServiceImpl extends ServiceImpl<FundMapper, Fund> implements FundService{
    @Autowired
    private FundMapper fundMapper;
}
