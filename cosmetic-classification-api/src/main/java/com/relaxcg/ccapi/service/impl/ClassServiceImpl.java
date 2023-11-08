package com.relaxcg.ccapi.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.relaxcg.ccapi.common.utils.BeanUtils;
import com.relaxcg.ccapi.controller.request.ClassReq;
import com.relaxcg.ccapi.controller.request.ClassUpdateReq;
import com.relaxcg.ccapi.controller.vo.ClassVO;
import com.relaxcg.ccapi.repository.dao.ClassMapper;
import com.relaxcg.ccapi.repository.entity.ClassDO;
import com.relaxcg.ccapi.service.IClassService;
import com.relaxcg.ccapi.service.base.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author relaxcg
 * @date 2023/11/8 17:24
 */
@Slf4j
@Service
public class ClassServiceImpl extends BaseServiceImpl<ClassMapper, ClassDO, ClassReq, ClassUpdateReq, ClassVO> implements IClassService {

    @Override
    public Integer create(ClassReq req) {
        boolean exists = exists(Wrappers.query(ClassDO.class).lambda().eq(ClassDO::getName, req.getName()));
        if (exists) {
            // TODO: 2023/11/8
        } else {
            val classDO = BeanUtils.copy(req, ClassDO.class, t -> t.setCreateTime(LocalDateTime.now()));
            log.info("classDO:{}", JSON.toJSONString(classDO));
            save(classDO);
            return classDO.getId();
        }
        return null;
    }

    @Override
    public Integer update(ClassUpdateReq updateReq) {
        var classDO = getOne(Wrappers.query(ClassDO.class).lambda().select(ClassDO::getId).eq(ClassDO::getName, updateReq.getName()));
        if (classDO == null || !classDO.getId().equals(updateReq.getId())) {
            classDO = classDO == null ? BeanUtils.copy(updateReq, ClassDO.class)
                    : BeanUtils.set(classDO, d -> d.setName(updateReq.getName()));
            boolean success = updateById(classDO);
            return success ? updateReq.getId() : null;
        }
        return null;
    }
}
