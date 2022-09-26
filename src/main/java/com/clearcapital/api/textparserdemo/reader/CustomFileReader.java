package com.clearcapital.api.textparserdemo.reader;

import java.io.FileNotFoundException;
import java.util.List;

public interface CustomFileReader {
    public List<String> read(String fileName) throws FileNotFoundException;
}
