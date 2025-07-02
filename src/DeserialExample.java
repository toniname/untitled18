import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialExample {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.dat"))) {
            Student loader = (Student) objectInputStream.readObject();

            System.out.println(loader.name + " " + loader.age + "\n");
            loader.show();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
