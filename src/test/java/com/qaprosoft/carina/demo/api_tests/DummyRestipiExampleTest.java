package com.qaprosoft.carina.demo.api_tests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.demo.api.dummy_restipiexample.*;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class DummyRestipiExampleTest {
    @Test()
    public void testGetListEmployee() {
        GetListEmployees getUsersMethods = new GetListEmployees();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("api/dummy_restipiexample/_get/rsemployees.scheme");
    }

    @Test()
    public void testGetEmployee() {
        GetEmployeeMethod getEmployeeMethod = new GetEmployeeMethod();
        getEmployeeMethod.callAPIExpectSuccess();
        getEmployeeMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getEmployeeMethod.validateResponseAgainstSchema("api/dummy_restipiexample/_get/rsget.json");
    }

    @Test()
    public void testPostEmployee() {
        PostEmployeeMethod postEmployeeMethod = new PostEmployeeMethod();
        postEmployeeMethod.setProperties("api/dummy_restipiexample/employee.properties");
        postEmployeeMethod.getProperties().setProperty("name", "Gigi");
        postEmployeeMethod.getProperties().setProperty("salary", "500");
        postEmployeeMethod.getProperties().setProperty("age", "20");
        postEmployeeMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        postEmployeeMethod.callAPI();
        postEmployeeMethod.validateResponse();
    }

    @Test()
    public void testDeleteEmployee() {
        DeleteEmployeeMethod deleteEmployeeMethod = new DeleteEmployeeMethod();
        deleteEmployeeMethod.setProperties("api/dummy_restipiexample/employee.properties");
        deleteEmployeeMethod.getProperties().setProperty("name", "Irakli");
        deleteEmployeeMethod.getProperties().setProperty("salary", "50000");
        deleteEmployeeMethod.getProperties().setProperty("age", "29");
        deleteEmployeeMethod.callAPIExpectSuccess();
        deleteEmployeeMethod.validateResponse();
    }

    @Test()
    public void testPutEmployee() {
        PutEmployeeMethod putEmployeeMethod = new PutEmployeeMethod();
        putEmployeeMethod.setProperties("api/dummy_restipiexample/employee.properties");
        putEmployeeMethod.getProperties().setProperty("name", "Irakli");
        putEmployeeMethod.getProperties().setProperty("salary", "50000");
        putEmployeeMethod.getProperties().setProperty("age", "29");
        putEmployeeMethod.callAPIExpectSuccess();
        putEmployeeMethod.validateResponse();
    }

    @Test()
    public void testPostEmployeeMissingSomeFields() {
        PostEmployeeMethod postEmployeeMethod = new PostEmployeeMethod();
        postEmployeeMethod.setProperties("api/dummy_restipiexample/employee.properties");
        postEmployeeMethod.getProperties().setProperty("name", "Gigi");
        postEmployeeMethod.getProperties().remove("salary");
        postEmployeeMethod.getProperties().remove("age");
        postEmployeeMethod.setResponseTemplate("api/dummy_restipiexample/_post/rsmissingpost.json");
        postEmployeeMethod.callAPIExpectSuccess();
        postEmployeeMethod.validateResponse();
    }
}
