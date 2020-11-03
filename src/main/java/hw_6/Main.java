package hw_6;

import exceptions.StringFormatException;
import utils.StringHelper;
import utils.UserInfoHelper;

public class Main {

    public static void main(String[] args) throws StringFormatException {
        StringHelper stringHelper = new StringHelper();
        UserInfoHelper userInfoHelper = new UserInfoHelper();
        String newString = "tEsTsTrInG";
        char [] newArray = {'k','A', 'w', 'O', 'i', 'S', 'h', 'O'};
        try{
            System.out.println(String.format("Well, I guess strings: %s - are successfully checked", stringHelper.someActionsWithString(newString,newArray)));
        }
        catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }
        catch (StringFormatException stringFormatException){
            System.out.println(stringFormatException);
        }
        userInfoHelper.checkUserNumber();
        userInfoHelper.checkUserEmail();
        userInfoHelper.checkUserDate();
    }
}
