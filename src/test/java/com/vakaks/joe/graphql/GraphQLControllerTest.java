package com.vakaks.joe.graphql;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(GraphQLController.class)
class GraphQLControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    @DisplayName("GET PRODUCT BY ID")
    void product() {
    }

    @Test
    @DisplayName("GET ALL PRODUCTS")
    void products() {
    }

    @Test
    @DisplayName("GET PRODUCTS BY NAME")
    void productsByName() {
    }

    @Test
    @DisplayName("GET PRODUCTS BY PRICE")
    void productsByPrice() {
    }

    @Test
    @DisplayName("CREATE PRODUCT")
    void createProduct() {
    }

    @Test
    @DisplayName("UPDATE PRODUCT")
    void updateProduct() {
    }

    @Test
    @DisplayName("DELETE PRODUCT")
    void deleteProduct() {
    }

    @Test
    @DisplayName("UPDATE PRODUCT PRICE")
    void updateProductPrice() {
    }
}