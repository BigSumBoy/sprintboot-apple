package com.example.apple.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.DebitCardMapper;
import com.example.apple.model.entity.DebitCard;
import com.example.apple.service.DebitCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: DebitCardServiceImpl
 * Package: com.example.apple.service.impl
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 16:22
 * @Version 1.0
 */
@Service
public class DebitCardServiceImpl extends ServiceImpl<DebitCardMapper, DebitCard> implements DebitCardService {
    @Autowired
    private DebitCardMapper debitCardMapper;
    
}
