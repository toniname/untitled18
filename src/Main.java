
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Ann", "Bob", "Bill");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 5, 6, 5, 8, 5, 10);

        Stream<String> namesStream = names.stream().filter((name) -> name.contains("J"));
        namesStream.forEach(System.out::println);

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        names.stream()
                .sorted()
                .forEach(System.out::println);

        numbers.stream()
                .limit(3)
                .skip(1)
                .forEach(System.out::println);

        names.stream()
                .peek(n -> System.out.println("before: " + n))
                .filter(n -> n.startsWith("B"))
                .peek(n -> System.out.println("after: " + n))
                .forEach(System.out::println);

        List<List<String>> groups = Arrays.asList(Arrays.asList("A", "B"),
                Arrays.asList("C", "D"));
        System.out.println(groups);

        groups.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(5));

        Predicate<Integer> isEven01 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(isEven01.test(4));


        Function<String, Integer> stringLength = String::length;
        System.out.println(stringLength.apply("Hello"));

        Consumer<String> print = System.out::println;
        print.accept("Hello");

        Supplier<String> message = () -> "Hello";
        System.out.println(message.get());

        Stream<Integer> intStream = Stream.of(1, 2, 3);
        intStream.filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}