package com.example.apple.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apple.model.entity.Client;

/**
 * ClassName: ClientService
 * Package: com.example.apple.service.imp
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 15:54
 * @Version 1.0
 */
public interface ClientService extends IService<Client> {
   String verifyPassword(String account,String password);
}
