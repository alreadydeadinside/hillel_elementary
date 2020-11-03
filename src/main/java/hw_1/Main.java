package hw_1;

import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        Admin admin = new Admin();
        admin.setName("Bohdan");
        admin.setSurname("Vakaliuk");
        admin.setAge(19);
        admin.setEmail("bry****@ukr.net");
        admin.setPassword("*********");


        User user = new User();
        user.setName("Vasya");
        user.setSurname("Pupkin");
        user.setAge(26);
        user.setEmail("vasya_pupkin@gmail.com");
        user.setPassword("*****");

        AdminService adminService = new AdminService();
        //4.5
        System.out.println(adminService.entityVerification(user));
        //4.3
        adminService.userDataWritten(admin);
        adminService.userDataWritten(user);

        UserService userService = new UserService();
        //4.4
        System.out.println(userService.entityVerification(admin));
        //4.2
        userService.userDataWritten(user);
    }
}