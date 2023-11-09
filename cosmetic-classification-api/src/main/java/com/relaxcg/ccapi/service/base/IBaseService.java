package com.relaxcg.ccapi.service.base;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author relaxcg
 * @date 2023/11/8 17:24
 */
public interface IBaseService<V, T> extends IService<T> {

    Integer create(R req);

    <U> Integer update(U updateReq);

    <V> V get(Integer id);

}
