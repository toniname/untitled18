import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; //serial version UID is used for serialization and deserialization. It is used to verify the compatibility of the sender and receiver.
    String name;
    int age;
    transient String password;//transient means that this field will not be serialized
    transient String address;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.password = "password";
        this.address = "address";
    }

    public void show() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("password: " + password);
        System.out.println("address: " + address);
    }
}
