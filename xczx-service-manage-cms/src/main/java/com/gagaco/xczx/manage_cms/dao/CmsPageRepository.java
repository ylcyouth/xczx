package com.gagaco.xczx.manage_cms.dao;

import com.gagaco.xczx.fw.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wjj
 * @date 2019-5-11 23:27:23
 */
@Repository
public interface CmsPageRepository extends MongoRepository<CmsPage, String> {

    /**
     * 根据页面名称查询页面
     */
    CmsPage findByPageName(String pageName);
}
