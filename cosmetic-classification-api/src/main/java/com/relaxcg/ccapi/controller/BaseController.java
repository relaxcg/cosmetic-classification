package com.relaxcg.ccapi.controller;

import com.relaxcg.ccapi.base.result.Result;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author relaxcg
 * @date 2023/11/8 17:10
 */
public interface BaseController<R, U, V> {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Result<Integer> create(@Validated R req);

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Result<Boolean> delete(@PathVariable("id") Integer id);

    @PatchMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Result<Integer> update(@Validated U updateReq);

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    Result<V> get(@RequestParam("id") Integer id);
}
