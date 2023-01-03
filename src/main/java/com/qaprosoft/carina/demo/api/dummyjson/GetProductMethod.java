package com.qaprosoft.carina.demo.api.dummyjson;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/products/${id}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/dummyjson/_get/rsproduct.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductMethod extends AbstractApiMethodV2 {
    public GetProductMethod(String id) {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_dummyjson_url"));
        replaceUrlPlaceholder("id", id);
    }
}
