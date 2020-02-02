package com.example.webjson.test;

import com.example.webjson.api.StackQuery;
import com.example.webjson.data.ResultData;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class ApiTest {
    @org.junit.Test
    public void test() throws IOException {
        StackQuery query = new StackQuery();
        query.setSearchTerm("Angular mono");
        query.setSortBy(StackQuery.SortBy.RELEVANCE);
        query.setSortOrder(StackQuery.SortOrder.ASCENDING);
        List<ResultData> results = query.getResult();
        assertNotEquals(0, results);
    }
}
