package com.example.apple.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apple.mapper.ClientMapper;
import com.example.apple.model.entity.Client;
import com.example.apple.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: ClientServiceImp
 * Package: com.example.apple.service.imp
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 16:00
 * @Version 1.0
 */
@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements ClientService {
    @Autowired
    private ClientMapper clientMapper;
    
    @Override
    public String verifyPassword(String account,String password) {
        QueryWrapper<Client> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account",account);
        queryWrapper.eq("pwd",password);
        Client client = clientMapper.selectOne(queryWrapper);
        if(client == null){
            return null;
        }else{
            return client.getId();
        }
    }
}
