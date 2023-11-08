package com.relaxcg.ccapi.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author relaxcg
 * @date 2023/11/8 14:37
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("cc_class")
@NoArgsConstructor
public class ClassDO extends BaseDO {
    private String name;

    public ClassDO(String name) {
        this.name = name;
    }
}
