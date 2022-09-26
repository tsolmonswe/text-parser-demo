package com.clearcapital.api.textparserdemo;

import com.clearcapital.api.textparserdemo.parser.CustomTextParser;
import com.clearcapital.api.textparserdemo.parser.TabParserImpl;
import com.clearcapital.api.textparserdemo.reader.CustomFileReader;
import com.clearcapital.api.textparserdemo.reader.FileReaderImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TextParserDemoApplication {

    public static void main(String[] args) throws IOException {
            String FILE_NAME = "test.tab";
            CustomTextParser parser = new TabParserImpl();
            CustomFileReader reader= new FileReaderImpl();
            List<List<String>> result = new ArrayList<>();
            for(String line : reader.read(FILE_NAME)){
                result.add(parser.parse(line));
            }
            System.out.println(result);
        //SpringApplication.run(TextParserDemoApplication.class, args);
    }

}
