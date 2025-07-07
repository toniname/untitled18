import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
        users.add(new User("Ivan", "rwerer@gmail.com"));
        users.add(new User("Olga", "olga@gmail.com"));
        users.add(new User("Petr", "petr@gmail.com"));
    }

    public User addUser(String name, String email ) {
        User user = new User(name, email);
        users.add(user);
        return user;
    }

    public User searchByName( String name ) {
        String sLoverCaces = name.toLowerCase();

        for (User user : users) {
            if (user.getName().toLowerCase().contains(sLoverCaces)) {
                return user;
            }
        }
        return null;
    }

    public Optional<User> searchByFactionInterface( String name ) {
        String sLoverCaces = name.toLowerCase();
        return users.stream().
                filter(u -> u.getName().toLowerCase().contains(sLoverCaces)||
                        u.getEmail().toLowerCase().contains(sLoverCaces)).
                findFirst();
    }
}
