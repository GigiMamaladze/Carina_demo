package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.mytests.reqresin.GetUserMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ReqresTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "gigi")
    public void getUserTest(){
        GetUserMethod getUserMethod = new GetUserMethod();
        getUserMethod.callAPIExpectSuccess();
        getUserMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUserMethod.validateResponseAgainstSchema("api/users/_get/reqresUsers.schema");
    }
}
