package utils;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public Optional<String> checkEmail(String string){

        Optional<String> email = Optional.of(string);
        Optional<String> empty = Optional.empty();

        Pattern pattern =
                Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+" +
                        "(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        Matcher matcher = pattern.matcher(string);

        if (matcher.matches()) {
            System.out.println("Email \"" + string + "\" is correct");
            return email;
        } else {
            System.out.println("Email \"" + string + "\" is incorrect");
            return empty;
        }
    }
}