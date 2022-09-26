package com.clearcapital.api.textparserdemo;
import com.clearcapital.api.textparserdemo.parser.CustomTextParser;
import com.clearcapital.api.textparserdemo.parser.TabParserImpl;
import com.clearcapital.api.textparserdemo.reader.CustomFileReader;
import com.clearcapital.api.textparserdemo.reader.FileReaderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class TextParserDemoApplicationTests {

    @Test
    void tabParserTest(){
        CustomTextParser parser = new TabParserImpl();
        List<String> list1 = parser.parse("Hello World");
        String arr[] = {"Hello","World"};
        List<String> list2 = Arrays.asList(arr);
        Assertions.assertEquals(list1,list2);
    }

    @Test
    void fileReaderServiceTest() throws FileNotFoundException {
        CustomFileReader reader = new FileReaderImpl();
        List<String> list1 = reader.read("test.tab");
        String arr[] = {"This is  a   test red    green   blue","This    is  a   beautiful   day","Good    bye!"};
        List<String> list2 = Arrays.asList(arr);
        Assertions.assertEquals(list1,list2);
    }
}
