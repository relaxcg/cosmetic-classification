package com.relaxcg.ccapi.service;

import com.relaxcg.ccapi.controller.request.ClassReq;
import com.relaxcg.ccapi.controller.request.ClassUpdateReq;
import com.relaxcg.ccapi.controller.vo.ClassVO;

/**
 * @author relaxcg
 * @date 2023/11/8 17:23
 */
public interface IClassService {

    Integer create(ClassReq req);

    boolean delete(Integer id);

    Integer update(ClassUpdateReq updateReq);

    ClassVO getById(Integer id);

}
