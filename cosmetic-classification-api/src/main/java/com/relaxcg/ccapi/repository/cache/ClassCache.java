package com.relaxcg.ccapi.repository.cache;

import com.relaxcg.ccapi.repository.Utils;
import com.relaxcg.ccapi.repository.entity.ClassDO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author relaxcg
 * @date 2023/11/8 16:30
 */
@Component
public class ClassCache extends Cache<ClassDO> {

    @Override
    List<ClassDO> loadCache() {
        return Utils.getAll(Utils.FilePath.CLASS, ClassDO.class);
    }

    @Override
    public void add(ClassDO classDO) {
        getCache().add(classDO);
    }

    @Override
    public ClassDO getById(Integer id) {
        return getCache().stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<ClassDO> getByName(String name) {
        return getCache().stream().filter(d -> d.getName().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    boolean existsByName(String name) {
        return getCache().stream().anyMatch(d -> d.getName().equals(name));
    }
}
