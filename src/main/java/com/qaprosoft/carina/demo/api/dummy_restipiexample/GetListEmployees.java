package com.qaprosoft.carina.demo.api.dummy_restipiexample;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/employees", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/dummy_restipiexample/_get/rslist.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetListEmployees extends AbstractApiMethodV2 {
    public GetListEmployees() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_dummyrestipiexample_url"));
    }
}
