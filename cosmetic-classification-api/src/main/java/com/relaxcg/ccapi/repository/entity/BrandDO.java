package com.relaxcg.ccapi.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author relaxcg
 * @date 2023/11/9 14:22
 */
@Data
@TableName("cc_brand")
public class BrandDO {
    private Integer id;
    private String name;
}
