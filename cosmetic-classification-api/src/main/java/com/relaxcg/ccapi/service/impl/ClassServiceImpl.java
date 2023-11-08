package com.relaxcg.ccapi.service.impl;

import com.relaxcg.ccapi.controller.request.ClassReq;
import com.relaxcg.ccapi.controller.request.ClassUpdateReq;
import com.relaxcg.ccapi.controller.vo.ClassVO;
import com.relaxcg.ccapi.repository.dao.ClassMapper;
import com.relaxcg.ccapi.repository.entity.ClassDO;
import com.relaxcg.ccapi.service.IClassService;
import com.relaxcg.ccapi.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author relaxcg
 * @date 2023/11/8 17:24
 */
@Service
public class ClassServiceImpl extends BaseServiceImpl<ClassMapper, ClassDO, ClassReq, ClassUpdateReq, ClassVO> implements IClassService {
    @Override
    public Integer create(ClassReq req) {
        return null;
    }

    @Override
    public Integer update(ClassUpdateReq o) {
        return null;
    }
}
