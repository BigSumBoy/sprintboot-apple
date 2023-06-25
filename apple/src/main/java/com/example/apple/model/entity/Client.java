package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * ClassName: client
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 14:54
 * @Version 1.0
 */
@TableName(value = "client")
@Data
public class Client {
    @TableId(type = IdType.AUTO)
    private String id;
    private String name;
    private String account;
    private String pwd;
    private String email;
    private String phone;
    private String sex;
}
