package com.relaxcg.ccapi.base.mapperservice;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author relaxcg
 * @date 2023/11/9 14:01
 */
public class MapperServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {
    public MapperServiceImpl(M mapper) {
        super.baseMapper = mapper;
    }
}
