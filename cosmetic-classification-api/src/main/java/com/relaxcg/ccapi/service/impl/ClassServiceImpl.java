package com.relaxcg.ccapi.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.relaxcg.ccapi.common.utils.BeanUtils;
import com.relaxcg.ccapi.controller.request.ClassReq;
import com.relaxcg.ccapi.controller.request.ClassUpdateReq;
import com.relaxcg.ccapi.controller.vo.ClassVO;
import com.relaxcg.ccapi.repository.dao.ClassMapper;
import com.relaxcg.ccapi.repository.entity.ClassDO;
import com.relaxcg.ccapi.service.IClassService;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class ClassServiceImpl implements IClassService {
    private final ClassMapper classMapper;

    @Override
    public Integer create(ClassReq req) {
        boolean exists = classMapper.exists(Wrappers.query(ClassDO.class).lambda().eq(ClassDO::getName, req.getName()));
        if (exists) {
            // TODO: 2023/11/8
        } else {
            val classDO = BeanUtils.copy(req, ClassDO.class, t -> t.setCreateTime(LocalDateTime.now()));
            log.info("classDO:{}", JSON.toJSONString(classDO));
            classMapper.insert(classDO);
            return classDO.getId();
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return SqlHelper.retBool(classMapper.deleteById(id));
    }

    @Override
    public Integer update(ClassUpdateReq updateReq) {
        var classDO = classMapper.selectOne(Wrappers.query(ClassDO.class).lambda().select(ClassDO::getId).eq(ClassDO::getName, updateReq.getName()));
        if (classDO == null || !classDO.getId().equals(updateReq.getId())) {
            classDO = classDO == null ? BeanUtils.copy(updateReq, ClassDO.class)
                    : BeanUtils.set(classDO, d -> d.setName(updateReq.getName()));
            boolean success = SqlHelper.retBool(classMapper.updateById(classDO));
            return success ? updateReq.getId() : null;
        }
        return null;
    }

    @Override
    public ClassVO getById(Integer id) {
        val classDO = classMapper.selectById(id);
        return BeanUtils.copy(classDO, ClassVO.class);
    }

}
