package com.relaxcg.ccapi.repository.entity.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author relaxcg
 * @date 2023/11/8 15:41
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class BaseDO {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private LocalDateTime createTime;

    // @TableField(fill = FieldFill.INSERT_UPDATE)
    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    // private LocalDateTime modifyTime;

    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;

}
