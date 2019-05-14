package com.gagaco.xczx.manage_cms.service.impl;

import com.gagaco.xczx.fw.domain.cms.CmsPage;
import com.gagaco.xczx.fw.domain.cms.request.QueryPageRequest;
import com.gagaco.xczx.fw.model.response.CommonCode;
import com.gagaco.xczx.fw.model.response.QueryResponseResult;
import com.gagaco.xczx.fw.model.response.QueryResult;
import com.gagaco.xczx.manage_cms.dao.CmsPageRepository;
import com.gagaco.xczx.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    /**
     * 页面查询
     *
     * @param page
     * @param size
     * @param queryPageRequest
     */
    @Override
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {

        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        QueryResult queryResult = new QueryResult();
        queryResult.setList(all.getContent());
        queryResult.setTotal(all.getTotalElements());

        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);

        return queryResponseResult;
    }
}
