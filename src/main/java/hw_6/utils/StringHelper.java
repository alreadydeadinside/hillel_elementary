package hw_6.utils;

import exceptions.StringFormatException;

public class StringHelper {
    public String someActionsWithString(String str, char[] array) throws StringFormatException {
       if(array.length == 0){
           throw new NullPointerException("Array is empty! Fix it");
       }

       String str2 = String.valueOf(array);

       if(str.trim().isEmpty()){
           throw new StringFormatException("Your str is empty! Try again");
       }
       else {
           str = str.toUpperCase().trim();
       }

       if(str2.trim().isEmpty()){
           throw new StringFormatException("Your str2 is empty! Try again");
       }
       else {
           str2 = str2.toLowerCase().trim();
       }
       str = str.concat(" " + str2);
       str = str.substring(0,8) + str.substring(9, 19);

       return str;
    }
}
