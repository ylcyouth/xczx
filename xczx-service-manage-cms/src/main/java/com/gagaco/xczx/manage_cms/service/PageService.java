package com.gagaco.xczx.manage_cms.service;

import com.gagaco.xczx.fw.domain.cms.request.QueryPageRequest;
import com.gagaco.xczx.fw.model.response.QueryResponseResult;

/**
 * @author wjj
 * @version 1.0.1
 * @create 2019-5-11 23:27:23
 */
public interface PageService {

    /**
     * 页面查询
     */
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);


}
