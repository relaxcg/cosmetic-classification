package com.relaxcg.ccapi.service.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.relaxcg.ccapi.common.utils.BeanUtils;
import jakarta.annotation.Nullable;
import lombok.val;

/**
 * @author relaxcg
 * @date 2023/11/8 17:43
 */
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseService<T> {
    // private final Class<V> vClass;
    //
    // public BaseServiceImpl() {
    //     vClass = (Class<V>) ReflectionKit.getSuperClassGenericType(getClass(), IBaseService.class, 3);
    //     System.out.println("vClass:" + vClass.getName());
    // }

    // @Override
    // @Nullable
    // public V get(Integer id) {
    //     T t = getById(id);
    //     return BeanUtils.copy(t, vClass);
    // }

}
