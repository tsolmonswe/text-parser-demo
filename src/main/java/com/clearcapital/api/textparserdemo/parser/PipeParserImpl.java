package com.clearcapital.api.textparserdemo.parser;
import java.util.ArrayList;
import java.util.List;

public class PipeParserImpl implements CustomTextParser {
    final static String delimiter = "|";

    @Override
    public List<String> parse(String text) {
        List<String> result = new ArrayList<>();
        for(String s : text.split(delimiter)){
            result.add(s);
        }
        return result;
    }
}
