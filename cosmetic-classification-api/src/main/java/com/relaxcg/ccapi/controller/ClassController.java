package com.relaxcg.ccapi.controller;

import com.relaxcg.ccapi.base.result.Result;
import com.relaxcg.ccapi.controller.request.ClassReq;
import com.relaxcg.ccapi.controller.request.ClassUpdateReq;
import com.relaxcg.ccapi.controller.vo.ClassVO;
import com.relaxcg.ccapi.service.IClassService;
import jakarta.annotation.Resource;
import lombok.val;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author relaxcg
 * @date 2023/11/8 17:10
 */
@RequestMapping("class")
@RestController
public class ClassController implements BaseController<ClassReq, ClassUpdateReq, ClassVO> {
    @Resource
    private IClassService classService;

    @Override
    public Result<Integer> create(@RequestBody ClassReq req) {
        val id = classService.create(req);
        return Result.success(id);
    }

    @Override
    public Result<Boolean> delete(Integer id) {
        return Result.success(classService.removeById(id));
    }

    @Override
    public Result<Integer> update(ClassUpdateReq updateReq) {
        return null;
    }

    @Override
    public Result<ClassVO> get(Integer id) {
        return Result.success(classService.get(id));
    }

    @GetMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<List<ClassVO>> getAll() {
        return Result.success(classService.list()).map2VO(ClassVO.class);
    }
}
