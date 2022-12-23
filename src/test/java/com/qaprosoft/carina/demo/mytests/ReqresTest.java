package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.mytests.reqresin.GetUserMethod;
import com.qaprosoft.carina.demo.api.mytests.reqresin.PostUserMethod;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ReqresTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "gigi")
    public void getUserTest() {
        GetUserMethod getUserMethod = new GetUserMethod();
        getUserMethod.callAPIExpectSuccess();
        getUserMethod.validateResponse();
        getUserMethod.validateResponseAgainstSchema("api/users/_get/reqresUsers.schema");
    }

    @Test()
    @MethodOwner(owner = "gigi")
    public void createUser() {
        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.callAPI();
        postUserMethod.validateResponse();
    }

}
