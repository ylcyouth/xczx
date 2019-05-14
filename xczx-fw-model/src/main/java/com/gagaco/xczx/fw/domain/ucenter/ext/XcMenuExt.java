package com.gagaco.xczx.fw.domain.ucenter.ext;

import com.gagaco.xczx.fw.domain.course.ext.CategoryNode;
import com.gagaco.xczx.fw.domain.ucenter.XcMenu;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcMenuExt extends XcMenu {

    List<CategoryNode> children;
}
