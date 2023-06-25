package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: BuyFund
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 15:09
 * @Version 1.0
 */
@TableName(value = "buy_fund")
@Data
public class BuyFund {
    @TableId(type = IdType.AUTO)
    private String bfid;
    private String fid;
    private String id;
    private String ptime;
    private String pnum;
    
}
