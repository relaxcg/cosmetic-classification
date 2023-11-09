package com.relaxcg.ccapi.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.relaxcg.ccapi.controller.request.CosmeticPageQueryReq;
import com.relaxcg.ccapi.controller.request.CosmeticReq;
import com.relaxcg.ccapi.controller.vo.CosmeticPageVO;

/**
 * @author relaxcg
 * @date 2023/11/9 11:42
 */
public interface ICosmeticService {

    Integer create(CosmeticReq req);

    boolean delete(Integer id);

    Page<CosmeticPageVO> page(CosmeticPageQueryReq queryReq);

    CosmeticPageVO getOne(Integer id);
}
