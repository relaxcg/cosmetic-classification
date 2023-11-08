package com.relaxcg.ccapi.controller.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author relaxcg
 * @date 2023/11/8 17:22
 */
@Data
public class ClassVO implements Serializable {
    private Integer id;
    private String name;
    private LocalDateTime createTime;
}
