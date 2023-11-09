package com.relaxcg.ccapi.controller.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author relaxcg
 * @date 2023/11/9 11:43
 */
@Data
public class CosmeticReq implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String brandName;
    private LocalDate purchaseTime;
    private BigDecimal price;
    private LocalDate expireTime;
    private Byte useStatus;
}
