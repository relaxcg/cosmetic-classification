package com.relaxcg.ccapi.common.utils;

/**
 * @author relaxcg
 * @date 2023/11/8 18:15
 */
@FunctionalInterface
public interface CopyStrategy<S, T> {

    void strategy(S source, T target);
}
