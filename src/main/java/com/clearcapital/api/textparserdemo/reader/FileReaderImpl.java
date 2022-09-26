package com.clearcapital.api.textparserdemo.reader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.ResourceUtils.*;

public class FileReaderImpl implements CustomFileReader{
    @Override
    public List<String> read(String fileName) throws FileNotFoundException {
        BufferedReader br = null;
        List<String> result = new ArrayList<>();
        File file = getFile("classpath:" + fileName);
        try{
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        finally
        {
            try {
                if (br != null)
                    br.close();
            }
            catch (IOException ioe)
            {
                System.out.println("Error in closing the BufferedReader");
            }
        }
        return result;
    }
}
