package com.relaxcg.ccapi.base;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author relaxcg
 * @date 2023/11/8 16:23
 */
@Data
@AllArgsConstructor
public class Pager<T> implements Serializable {
    private List<T> list;
    private int currentPage;
    private int pageSize;
    private int total;

}
