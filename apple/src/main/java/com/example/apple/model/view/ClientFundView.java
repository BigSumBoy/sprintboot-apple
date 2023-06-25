package com.example.apple.model.view;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: ClientFundView
 * Package: com.example.apple.model.view
 * Description:.用户查询到的基金视图
 *
 * @Author zhou
 * @Create 2023/6/23 16:01
 * @Version 1.0
 */
@Data
public class ClientFundView {
    private Integer bfid;
    private Integer fid;
    private String name;
    private String ptime;
    private BigDecimal pnum;
}
