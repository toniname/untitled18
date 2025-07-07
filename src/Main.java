
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Ann", "Bob", "Bill");
        Stream<String> namesStream = names.stream().filter((name) -> name.contains("J"));
        namesStream.forEach(System.out::println);

    }
}