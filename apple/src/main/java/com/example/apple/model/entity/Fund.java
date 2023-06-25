package com.example.apple.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: Fund
 * Package: com.example.apple.model.entity
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 15:07
 * @Version 1.0
 */
@TableName(value = "fund")
@Data
public class Fund {
    @TableId(type = IdType.AUTO)
    private String fid;
    private String name;
    private String description;
    private String manager;
    private Integer level;
    private BigDecimal price;
    private String state;
    
}
