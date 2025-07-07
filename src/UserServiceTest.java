import java.util.Optional;

public class UserServiceTest {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User ivan1 = userService.searchByName("Ivan");
        System.out.println(ivan1);
        Optional<User> ivan2 = userService.searchByFactionInterface("Ivan");
        System.out.println(ivan2);
        System.out.println("-------------------");

        User user01 = userService.searchByName("Ivan2");
        System.out.println(user01);
        Optional<User> user02 = userService.searchByFactionInterface("Ivan2");
        System.out.println(user02);

        if (ivan1 != null){
            System.out.println("Ivan1 is present");
        }else{
            System.out.println("Ivan1 is absent");
        }

        ivan2.ifPresentOrElse(user -> System.out.println(user02), () -> System.out.println("Ivan2 is absent") );

    }
}
