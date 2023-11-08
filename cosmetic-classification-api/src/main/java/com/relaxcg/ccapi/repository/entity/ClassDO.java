package com.relaxcg.ccapi.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @author relaxcg
 * @date 2023/11/8 14:37
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("cc_class")
public class ClassDO extends BaseDO {
    private String name;
    private LocalDateTime createTime;

    public ClassDO(Integer id, String name, LocalDateTime createTime) {
        super(id);
        this.name = name;
        this.createTime = createTime;
    }
}
