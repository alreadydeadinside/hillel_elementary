package hw_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService implements DefaultService {


    @Override
    public boolean entityVerification(MainEntity mainEntity) throws IOException {
        FileReader fileReaderUser = new FileReader("./src/CurrentUser.txt");
        Scanner userScanner = new Scanner(fileReaderUser);

        while (userScanner.hasNextLine()){
            if(userScanner.nextLine().equals(mainEntity.getEmail())){
                return true;
            }
        }
        fileReaderUser.close();
        return false;
    }

    @Override
    public void userDataWritten(MainEntity mainEntity) {
        System.out.println("User is not allowed!");

    }
}