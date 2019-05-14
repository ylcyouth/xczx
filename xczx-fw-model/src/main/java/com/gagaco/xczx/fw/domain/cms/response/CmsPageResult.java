package com.gagaco.xczx.fw.domain.cms.response;

import com.gagaco.xczx.fw.domain.cms.CmsPage;
import com.gagaco.xczx.fw.model.response.ResponseResult;
import com.gagaco.xczx.fw.model.response.ResultCode;
import lombok.Data;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
