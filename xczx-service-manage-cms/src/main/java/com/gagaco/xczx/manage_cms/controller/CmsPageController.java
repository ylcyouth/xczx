package com.gagaco.xczx.manage_cms.controller;

import com.gagaco.xczx.api.cms.CmsPageControllerApi;
import com.gagaco.xczx.fw.domain.cms.request.QueryPageRequest;
import com.gagaco.xczx.fw.model.response.QueryResponseResult;
import com.gagaco.xczx.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjj
 * @version 1.0.1
 * @create 2019-5-11 23:41:27
 */
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    private PageService pageService;

    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(
            @PathVariable("page") int page,
            @PathVariable("size") int size,
            QueryPageRequest queryPageRequest) {
        //参数判断
        if (page <= 0) {
            page = 1;
        }
        page--;
        if (size <= 0) {
            size = 10;
        }
        return pageService.findList(page, size, queryPageRequest);
    }
}
