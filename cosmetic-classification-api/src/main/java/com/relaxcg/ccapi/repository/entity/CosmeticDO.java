package com.relaxcg.ccapi.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.relaxcg.ccapi.repository.entity.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author relaxcg
 * @date 2023/11/9 11:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("cc_cosmetic")
public class CosmeticDO extends BaseDO {

    private String name;
    private Integer brandId;
    private String brandName;
    private LocalDate purchaseTime;
    private BigDecimal price;
    private LocalDate expireTime;
    private Byte useStatus;
}
