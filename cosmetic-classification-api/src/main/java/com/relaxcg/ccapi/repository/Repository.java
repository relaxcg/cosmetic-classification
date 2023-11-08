package com.relaxcg.ccapi.repository;

/**
 * @author relaxcg
 * @date 2023/11/8 15:56
 */
public interface Repository<D> {

    void save(D d);

    void delete(Integer id);

    void update(D d);

    void getByName(String name);
}
