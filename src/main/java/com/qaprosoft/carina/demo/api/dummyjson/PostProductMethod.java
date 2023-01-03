package com.qaprosoft.carina.demo.api.dummyjson;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/products/add", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/dummyjson/_post/rqpost.json")
@ResponseTemplatePath(path = "api/dummyjson/_post/rspost.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostProductMethod extends AbstractApiMethodV2 {
    public PostProductMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_dummyjson_url"));
    }
}
