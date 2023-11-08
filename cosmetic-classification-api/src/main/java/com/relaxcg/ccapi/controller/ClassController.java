package com.relaxcg.ccapi.controller;

import com.relaxcg.ccapi.base.result.Result;
import com.relaxcg.ccapi.controller.request.ClassReq;
import com.relaxcg.ccapi.controller.request.ClassUpdateReq;
import com.relaxcg.ccapi.controller.vo.ClassVO;
import com.relaxcg.ccapi.service.IClassService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result<Integer> create(ClassReq req) {
        return null;
    }

    @Override
    public Result<Boolean> delete(Integer id) {
        return null;
    }

    @Override
    public Result<Integer> update(ClassUpdateReq updateReq) {
        return null;
    }

    @Override
    public Result<ClassVO> get(Integer id) {
        return null;
    }
}
