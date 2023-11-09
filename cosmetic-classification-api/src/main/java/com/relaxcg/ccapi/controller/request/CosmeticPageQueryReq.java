package com.relaxcg.ccapi.controller.request;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author relaxcg
 * @date 2023/11/9 14:17
 */
public class CosmeticPageQueryReq implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String brandName;
    private LocalDateTime purchaseTimeMin;
    private LocalDateTime purchaseTimeMax;
    private LocalDateTime expireTimeMin;
    private LocalDateTime expireTimeMax;

    private String sorter;
    private boolean esc;
}
