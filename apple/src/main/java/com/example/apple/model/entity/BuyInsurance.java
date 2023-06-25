package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

/**
 * ClassName: buy_insurance
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 15:22
 * @Version 1.0
 */
@TableName(value = "buy_insurance")
public class BuyInsurance {
    @TableId(type = IdType.AUTO)
    private Integer biid;
    private Integer iid;
    private String id;
    private String ptime;
    private Integer pnum;
}
