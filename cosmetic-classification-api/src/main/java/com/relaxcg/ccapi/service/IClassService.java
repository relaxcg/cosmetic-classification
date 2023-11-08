package com.relaxcg.ccapi.service;

import com.relaxcg.ccapi.controller.request.ClassReq;
import com.relaxcg.ccapi.controller.request.ClassUpdateReq;
import com.relaxcg.ccapi.controller.vo.ClassVO;
import com.relaxcg.ccapi.repository.entity.ClassDO;
import com.relaxcg.ccapi.service.base.IBaseService;

/**
 * @author relaxcg
 * @date 2023/11/8 17:23
 */
public interface IClassService extends IBaseService<ClassDO, ClassReq, ClassUpdateReq, ClassVO> {

}
