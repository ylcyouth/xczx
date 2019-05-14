package com.gagaco.xczx.fw.domain.media.request;

import com.gagaco.xczx.fw.model.request.RequestData;
import lombok.Data;

@Data
public class QueryMediaFileRequest extends RequestData {

    private String fileOriginalName;
    private String processStatus;
    private String tag;
}
