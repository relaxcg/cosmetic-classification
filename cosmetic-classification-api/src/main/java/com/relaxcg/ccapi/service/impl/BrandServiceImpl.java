package com.relaxcg.ccapi.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.relaxcg.ccapi.repository.dao.BrandMapper;
import com.relaxcg.ccapi.repository.entity.BrandDO;
import com.relaxcg.ccapi.service.IBrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author relaxcg
 * @date 2023/11/9 14:29
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements IBrandService {
    private final BrandMapper brandMapper;
    private static final Map<String, Integer> BRAND_CACHE = new ConcurrentHashMap<>();

    @Override
    public Integer createIfNotExists(String brandName) {
        Integer brandId = BRAND_CACHE.get(brandName);
        if (brandId != null) {
            return brandId;
        } else {
            var brandDO = brandMapper.selectOne(Wrappers.lambdaQuery(BrandDO.class).eq(BrandDO::getName, brandName));
            if (brandDO != null) {
                BRAND_CACHE.put(brandName, brandDO.getId());
            } else {
                brandDO = new BrandDO();
                brandDO.setName(brandName);
                brandMapper.insert(brandDO);
            }
            return brandDO.getId();
        }
    }
}
