package com.relaxcg.ccapi.common.utils;

import com.google.common.collect.Lists;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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

    public static <S, T> T copy(S source, Class<T> tClass, Consumer<T> strategy) {
        return ClassUtils.newInstanceOpt(tClass)
                .map(target -> {
                    copyProperties(source, target);
                    strategy.accept(target);
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

    public static <T> T set(T target, @NonNull Consumer<T> strategy) {
        if (target != null) {
            strategy.accept(target);
        }
        return target;
    }

    public static <S, T> List<T> copyList(List<S> source, @NonNull Class<T> tClass) {
        if (source != null) {
            return source.stream().map(s -> copy(s, tClass)).collect(Collectors.toList());
        }
        return Lists.newArrayList();
    }


}
