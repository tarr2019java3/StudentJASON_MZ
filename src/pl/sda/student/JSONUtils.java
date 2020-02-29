package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUtils {
    public void writeList ( String fileName, List<Student> students){
        ObjectMapper objectMapper = new ObjectMapper ();
        try {
            objectMapper.writeValue(new File (fileName), students);
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
    public void readList(String Name) {
        ObjectMapper objectMapper = new ObjectMapper ( );
        try {
            Student[] students = objectMapper.readValue (new File (Name),  Student[].class);
            for (Student stu: students) {
                System.out.println (stu.getName ( ) + " " + stu.getLastname () + " " + stu.getIndex ());
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
