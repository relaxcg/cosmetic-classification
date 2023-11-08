package com.relaxcg.ccapi.controller.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author relaxcg
 * @date 2023/11/8 17:23
 */
@Data
public class ClassUpdateReq implements Serializable {
    private Integer id;
    private String name;
}
