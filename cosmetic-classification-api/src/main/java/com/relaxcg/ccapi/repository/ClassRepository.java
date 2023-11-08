package com.relaxcg.ccapi.repository;

import com.relaxcg.ccapi.repository.cache.ClassCache;
import com.relaxcg.ccapi.repository.entity.ClassDO;
import jakarta.annotation.Resource;

/**
 * @author relaxcg
 * @date 2023/11/8 14:39
 */
public class ClassRepository implements Repository<ClassDO> {
    @Resource
    private ClassCache classCache;

    @Override
    public void save(ClassDO classDO) {
        Utils.append(classDO);
        classCache.add(classDO);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(ClassDO classDO) {

    }

    @Override
    public void getByName(String name) {

    }
}
