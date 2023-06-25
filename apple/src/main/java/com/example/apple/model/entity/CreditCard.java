package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: CreditCard
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 14:58
 * @Version 1.0
 */
@TableName(value = "credit_card")
@Data
public class CreditCard {
    @TableId(type = IdType.AUTO)
    private String ccid;
    private String id;
    private String pwd;
    private BigDecimal max_limit;
    private BigDecimal  used;
    private String btime;
}
