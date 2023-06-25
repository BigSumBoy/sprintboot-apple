package com.example.apple.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.CreditCardMapper;
import com.example.apple.model.entity.CreditCard;
import com.example.apple.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: CreditCardServiceImpl
 * Package: com.example.apple.service.impl
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 16:13
 * @Version 1.0
 */
@Service
public class CreditCardServiceImpl extends ServiceImpl<CreditCardMapper, CreditCard> implements CreditCardService {
    @Autowired
    private CreditCardMapper creditCardMapper;
}
