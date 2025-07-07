import java.util.function.Consumer;

interface Calculator {
    int add(int a, int b);


}

class MyCalculator {
    public int add(int a, int b, Calculator calculator) {
        return calculator.add(20, 40);
    }
}

class MyCalculator2 {
    public int add(int a, int b, Calculator calculator) {
        return calculator.add(40, 60);
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        MyCalculator2 myCalculator2 = new MyCalculator2();

        int sum = myCalculator.add(10, 20, new Calculator() {
            public int add(int a, int b) {
                System.out.println("Adding " + a + " and " + b);
                return a + b;
            }
        });

        int sum2 = myCalculator.add(10, 20, (a, b) -> {
            System.out.println("Adding " + a + " and " + b);
            return a + b;
        });

        int sum3 = myCalculator.add(10, 20, (int a, int b) -> a - b);
        int sum4 = myCalculator.add(10, 20, Integer::sum);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);


        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        printer.accept("Hello World");

        Consumer<String> printer2 = System.out::println;
        printer2.accept("Hello World");

    }
}
