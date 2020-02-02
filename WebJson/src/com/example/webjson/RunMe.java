package com.example.webjson;

import com.example.webjson.api.StackQuery;
import com.example.webjson.data.ResultData;

import java.io.IOException;
import java.util.List;

public class RunMe {
    public static void main(String[] args) throws IOException {
        StackQuery query = new StackQuery();
        query.setSearchTerm("Angular mono");
        query.setSortBy(StackQuery.SortBy.RELEVANCE);
        query.setSortOrder(StackQuery.SortOrder.ASCENDING);
        List<ResultData> results = query.getResult();
        for (ResultData result:
             results) {
            System.out.println(result.getTitle());
        }
    }
}
