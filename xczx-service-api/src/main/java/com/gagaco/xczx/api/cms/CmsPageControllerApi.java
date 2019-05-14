package com.gagaco.xczx.api.cms;

import com.gagaco.xczx.fw.domain.cms.request.QueryPageRequest;
import com.gagaco.xczx.fw.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author wjj
 * CmsPage操作的抽象接口，在cms工程中提供接口实现
 * @date 2019-5-11 22:30:36
 */
/*
在这个接口中使用Swagger工具来生成接口文档
@Api Swagger的注解，表示...
*/
@Api(value = "cms页面管理接口", description = "cms页面管理接口，提供页面的crud")
public interface CmsPageControllerApi {

    @ApiOperation("页面列表分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页面", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, paramType = "path", dataType = "int")
    })
    QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

}
