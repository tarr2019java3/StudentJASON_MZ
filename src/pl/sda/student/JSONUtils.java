package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUtils {
    public void writeList ( String nameFile, List list){
        ObjectMapper objectMapper = new ObjectMapper ();
        try {
            objectMapper.writeValue(new File (nameFile + "json"), list);
        } catch (IOException e) {
            e.printStackTrace ( );
        }

    }
    public Student[] readList(String Name){
        ObjectMapper objectMapper = new ObjectMapper ();
        try {
            return objectMapper.readValue (new File (Name), Student[].class);
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        return new Student[0];    
    }

}
