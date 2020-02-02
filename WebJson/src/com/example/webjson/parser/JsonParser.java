package com.example.webjson.parser;

import com.example.webjson.data.ResultData;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface JsonParser {
    List<ResultData> parseJson(InputStream input) throws IOException;
}
