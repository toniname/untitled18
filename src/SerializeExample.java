import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;

public class SerializeExample {

    public static void main(String[] args) {
        String fileName = "student.dat";


        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream( new FileOutputStream(fileName))) {
            Student student = new Student("John", 20);
            objectOutputStream.writeObject(student);
            System.out.println("Serialization done");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}
