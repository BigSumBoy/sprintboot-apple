package com.example.apple.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apple.model.entity.Admin;

/**
 * ClassName: AdminService
 * Package: com.example.apple.service
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/21 13:46
 * @Version 1.0
 */
public interface AdminService extends IService<Admin> {
    boolean verify(String account, String password);
}
