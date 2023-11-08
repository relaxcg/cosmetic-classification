package com.relaxcg.ccapi.common.utils;

import org.springframework.lang.NonNull;

/**
 * @author relaxcg
 * @date 2023/11/8 18:09
 */
public class BeanUtils extends org.springframework.beans.BeanUtils {

    public static <S, T> T copy(S source, Class<T> tClass) {
        return ClassUtils.newInstanceOpt(tClass)
                .map(target -> {
                    copyProperties(source, target);
                    return target;
                }).orElse(null);
    }

    public static <S, T> T copy(@NonNull S source, @NonNull Class<T> tClass, @NonNull CopyStrategy<S, T> strategy) {
        return ClassUtils.newInstanceOpt(tClass)
                .map(target -> {
                    copyProperties(source, target);
                    strategy.strategy(source, target);
                    return target;
                }).orElse(null);
    }


}
