package com.example.apple.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.AdminMapper;
import com.example.apple.model.entity.Admin;
import com.example.apple.model.entity.Client;
import com.example.apple.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: AdminServiceImpl
 * Package: com.example.apple.service.impl
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/21 13:47
 * @Version 1.0
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public boolean verify(String account, String password) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account",account);
        queryWrapper.eq("pwd",password);
        if(adminMapper.selectCount(queryWrapper) > 0){
            return true;
        }else{
            return false;
        }
    }
    
}
