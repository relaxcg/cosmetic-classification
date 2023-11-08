package com.relaxcg.ccapi.repository.cache;

import com.relaxcg.ccapi.repository.entity.BaseDO;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author relaxcg
 * @date 2023/11/8 15:28
 */
@Component
public abstract class Cache<D extends BaseDO> {
    private List<D> cache;

    @PostConstruct
    public void load() {
        cache = loadCache();
    }

    abstract List<D> loadCache();

    public List<D> getCache() {
        return cache;
    }

    abstract void add(D d);

    public void removeClass(Integer id) {
        getCache().removeIf(obj -> obj.getId().equals(id));
    }

    abstract D getById(Integer id);

    abstract List<D> getByName(String name);

    abstract boolean existsByName(String name);

}
