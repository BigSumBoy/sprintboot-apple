package com.example.apple.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.apple.model.entity.BuyFund;
import com.example.apple.model.view.ClientFundView;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: BuyFundMapper
 * Package: com.example.apple.mapper
 * Description:
 *
 * @Author zhou
 * @Create 2023/6/20 15:43
 * @Version 1.0
 */
@Repository
public interface BuyFundMapper extends BaseMapper<BuyFund> {
    /**
     * 用户查看自己的购买记录时的结果
     * @param id
     * @return
     */
    List<ClientFundView> getClientProperty(@Param("id") int id);
}
