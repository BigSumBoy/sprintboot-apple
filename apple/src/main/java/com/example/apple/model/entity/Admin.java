package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * ClassName: Admin
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/21 13:42
 * @Version 1.0
 */
@TableName("admin")
@Data
public class Admin {
    @TableId(type = IdType.AUTO)
    private String account;
    private String password;
}
