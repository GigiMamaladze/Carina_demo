package com.qaprosoft.carina.demo.api_tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.demo.api.dummyjson.*;
import com.qaprosoft.carina.demo.api.dummyjson.models.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class DummyJsonTest {
    private static final Logger LOGGER = LogManager.getLogger(DummyJsonTest.class);

    @Test
    public void testGetProductList() {
        GetProductListMethod getProductListMethod = new GetProductListMethod();
        getProductListMethod.callAPIExpectSuccess();
        getProductListMethod.validateResponseAgainstSchema("api/dummyjson/_get/rsproducts.scheme");
    }

    @Test
    public void testGetProduct() {
        GetProductMethod getProductMethod = new GetProductMethod("10");
        getProductMethod.callAPIExpectSuccess();
        getProductMethod.validateResponse();
    }

    @Test
    public void testGetSearchedProduct() {
        GetSearchedProductMethod getSearchedProductMethod = new GetSearchedProductMethod("Laptop");
        getSearchedProductMethod.callAPIExpectSuccess();
        getSearchedProductMethod.validateResponseAgainstSchema("api/dummyjson/_get/rsproducts.scheme");
    }

    @Test
    public void testGetCategoryListMethod() {
        GetCategoryListMethod getCategoryListMethod = new GetCategoryListMethod();
        getCategoryListMethod.callAPIExpectSuccess();
        getCategoryListMethod.validateResponse();
    }

    @Test
    public void testGetCategoriesItemMethod() {
        GetCategoriesItemMethod getCategoriesItemMethod = new GetCategoriesItemMethod("something");
        getCategoriesItemMethod.callAPIExpectSuccess();
        getCategoriesItemMethod.validateResponseAgainstSchema("api/dummyjson/_get/rsproducts.scheme");
    }

    @Test
    public void testPostProductMethod() throws JsonProcessingException {
        PostProductMethod postProductMethod = new PostProductMethod();
        postProductMethod.setProperties("api/dummyjson/product.properties");
        postProductMethod.callAPI();
        postProductMethod.validateResponse();
    }

    @Test
    public void testPostProductMethodMissingField() {
        //In this case, it still posted on api :)
        PostProductMethod postProductMethod = new PostProductMethod();
        postProductMethod.setProperties("api/dummyjson/product.properties");
        postProductMethod.getProperties().remove("title");
        postProductMethod.getProperties().remove("price");
        postProductMethod.getProperties().remove("brand");
        postProductMethod.callAPI();
        postProductMethod.validateResponse();
    }

    @Test(enabled = false)
    public void testDeleteProductMethodSkiped() throws JsonProcessingException {
        PostProductMethod postProductMethod = new PostProductMethod();
        postProductMethod.setProperties("api/dummyjson/product.properties");
        postProductMethod.callAPI();
        postProductMethod.validateResponse();
        String rs = postProductMethod.callAPI().asString();
        ObjectMapper mapper = new ObjectMapper();
        Product product = mapper.readValue(rs, Product.class);
        LOGGER.info(product.getId());
        DeleteProductMethod deleteProductMethod = new DeleteProductMethod(product.getId());
        deleteProductMethod.setProperties("api/dummyjson/productfull.properties");
        deleteProductMethod.getProperties().setProperty("id", String.valueOf(product.getId()));
        deleteProductMethod.getProperties().setProperty("title", product.getTitle());
        deleteProductMethod.getProperties().setProperty("description", product.getDescription());
        deleteProductMethod.getProperties().setProperty("price", product.getPrice());
        deleteProductMethod.getProperties().setProperty("rating", product.getRating());
        deleteProductMethod.getProperties().setProperty("stock", product.getStock());
        deleteProductMethod.getProperties().setProperty("brand", product.getBrand());
        deleteProductMethod.getProperties().setProperty("category", product.getCategory());
        deleteProductMethod.callAPI();
        deleteProductMethod.validateResponse();
    }

    @Test
    public void testDeleteProductMethod() {
        DeleteProductMethod deleteProductMethod = new DeleteProductMethod(11);
        deleteProductMethod.callAPIExpectSuccess();
        deleteProductMethod.validateResponse();
    }

    @Test
    public void testPutProductMethod() {
        PutProductMethod putProductMethod = new PutProductMethod(11);
        putProductMethod.setProperties("api/dummyjson/product.properties");
        putProductMethod.callAPI();
        putProductMethod.validateResponse();
    }

}
