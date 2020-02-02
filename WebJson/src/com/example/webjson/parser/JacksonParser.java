package com.example.webjson.parser;

import com.example.webjson.data.ResultData;
import com.example.webjson.data.ResultArray;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JacksonParser implements JsonParser {
    @Override
    public List<ResultData> parseJson(InputStream json) throws IOException {
        ResultArray items = new ObjectMapper().readValue(json, ResultArray.class);
        return items.getItems();
    }
}
