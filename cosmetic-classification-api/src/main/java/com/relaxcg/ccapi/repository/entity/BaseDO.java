package com.relaxcg.ccapi.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author relaxcg
 * @date 2023/11/8 15:41
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseDO {
    @TableId(type = IdType.AUTO)
    private Integer id;
}
