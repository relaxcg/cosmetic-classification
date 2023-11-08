package com.relaxcg.ccapi.base.result;

import com.relaxcg.ccapi.common.utils.BeanUtils;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author relaxcg
 * @date 2023/11/8 17:11
 */
@Data
@RequiredArgsConstructor
public class Result<T> {

    private static final String SUCCESS = "000000";

    private final String code;
    private final String msg;
    private final T data;

    public static <T> Result<T> success() {
        return new Result<>(SUCCESS, null, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(SUCCESS, null, data);
    }

    public <V> Result<List<V>> map2VO(Class<V> vClass) {
        if (data != null && data instanceof List<?> list) {
            return Result.success(BeanUtils.copyList(list, vClass));
        }
        return Result.success();
    }
}
