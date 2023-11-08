package com.relaxcg.ccapi.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author relaxcg
 * @date 2023/11/8 14:43
 */
@Data
public class ClassReq {

    @NotBlank(message = "品类名称不能为空")
    private String name;
}
