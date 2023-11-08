package com.relaxcg.ccapi.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * @author relaxcg
 * @date 2023/11/8 18:12
 */
public class ClassUtils {

    public static <T> T newInstance(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            return null;
        }
    }

    public static <T> Optional<T> newInstanceOpt(Class<T> tClass) {
        return Optional.ofNullable(newInstance(tClass));
    }
}
