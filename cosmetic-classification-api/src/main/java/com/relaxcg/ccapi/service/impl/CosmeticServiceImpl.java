package com.relaxcg.ccapi.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.relaxcg.ccapi.common.utils.BeanUtils;
import com.relaxcg.ccapi.controller.request.CosmeticPageQueryReq;
import com.relaxcg.ccapi.controller.request.CosmeticReq;
import com.relaxcg.ccapi.controller.vo.CosmeticPageVO;
import com.relaxcg.ccapi.repository.dao.CosmeticMapper;
import com.relaxcg.ccapi.repository.entity.CosmeticDO;
import com.relaxcg.ccapi.service.IBrandService;
import com.relaxcg.ccapi.service.ICosmeticService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author relaxcg
 * @date 2023/11/9 14:18
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CosmeticServiceImpl implements ICosmeticService {
    private final CosmeticMapper cosmeticMapper;
    private final IBrandService brandService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer create(CosmeticReq req) {
        val brandId = brandService.createIfNotExists(req.getBrandName());
        val cosmeticDO = BeanUtils.copy(req, CosmeticDO.class, t -> t.setBrandId(brandId));
        cosmeticMapper.insert(cosmeticDO);
        return cosmeticDO.getId();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Page<CosmeticPageVO> page(CosmeticPageQueryReq queryReq) {

        return null;
    }

    @Override
    public CosmeticPageVO getOne(Integer id) {
        return null;
    }
}
