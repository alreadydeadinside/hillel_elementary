package hw_6.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoHelper {
    public void checkUserNumber() {
        Pattern pattern = Pattern.compile("^((\\+?380)([0-9]{9}))$");
        String userPhoneNumber = "+380666666666";
        Matcher matcher = pattern.matcher(userPhoneNumber);
        if (matcher.matches()) {
            System.out.println(String.format("your phone number: %s - is valid", userPhoneNumber));
        } else {
            System.out.println(String.format("%s - INVALID", userPhoneNumber));
        }

    }

    public void checkUserEmail() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        String userEmail = "vasya_pupkin@ukr.net";
        Matcher matcher = pattern.matcher(userEmail);

        if (matcher.matches()) {
            System.out.println(String.format("your e-mail: %s - is valid", userEmail));
        } else {
            System.out.println(String.format("%s - INVALID", userEmail));
        }

    }

    public void checkUserDate() {
        Pattern pattern = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])(/|.|-)(0?[1-9]|1[012])(/|.|-)((19|20)\\d\\d)$");
        String userBirthDate = "06.07.2001";
        Matcher matcher = pattern.matcher(userBirthDate);

        if (matcher.matches()) {
            System.out.println(String.format("your birthdate: %s - is valid", userBirthDate));
        } else {
            System.out.println(String.format("%s - INVALID", userBirthDate));
        }

    }
}
