package com.relaxcg.ccapi.service.base;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author relaxcg
 * @date 2023/11/8 17:24
 */
public interface IBaseService<T, R, U, V> extends IService<T> {

    Integer create(R req);

    Integer update(U u);

    V get(Integer id);

}
