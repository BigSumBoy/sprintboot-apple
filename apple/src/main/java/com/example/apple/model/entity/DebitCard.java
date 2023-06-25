package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: DebitCard
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 15:01
 * @Version 1.0
 */
@TableName(value = "debit_card")
@Data
public class DebitCard {
    @TableId(type = IdType.AUTO)
    private String dcid;
    private String id;
    private String pwd;
    private BigDecimal balance;
    private BigDecimal  btime;
}
