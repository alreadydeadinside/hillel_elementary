package lesson10;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Linus");
        System.out.println(String.format("User name is: %s", user.getName()));
    }
}
