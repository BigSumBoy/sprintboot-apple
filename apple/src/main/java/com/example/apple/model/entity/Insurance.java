package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: Insurance
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 15:12
 * @Version 1.0
 */
@TableName(value = "insurance")
@Data
public class Insurance {
    @TableId(type = IdType.AUTO)
    private String fid;
    private String name;
    private String desciption;
    private Integer time_limit;
    private BigDecimal price;
    private BigDecimal amount;
    private String category;
}
