package com.qaprosoft.carina.demo.api.dummyjson;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/products/${id}", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/dummyjson/_put/rqput.json")
@ResponseTemplatePath(path = "api/dummyjson/_put/rsput.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutProductMethod extends AbstractApiMethodV2 {
    public PutProductMethod(int id) {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_dummyjson_url"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}
