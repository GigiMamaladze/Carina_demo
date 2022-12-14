package com.qaprosoft.carina.demo.api.dummy_restipiexample;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/create", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/dummy_restipiexample/_post/rqpost.json")
@ResponseTemplatePath(path = "api/dummy_restipiexample/_post/rspost.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostEmployeeMethod extends AbstractApiMethodV2 {
    public PostEmployeeMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_dummyrestipiexample_url"));
    }
}
