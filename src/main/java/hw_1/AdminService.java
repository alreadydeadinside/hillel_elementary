package hw_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class AdminService implements DefaultService {

    @Override
    public boolean entityVerification(MainEntity mainEntity) throws IOException {

        FileReader fileReaderAdmin = new FileReader("./src/CurrentUser.txt");
        Scanner adminScanner = new Scanner(fileReaderAdmin);

        while (adminScanner.hasNextLine()) {
            if(adminScanner.nextLine().equals(mainEntity.getEmail())){
                return true;
            }
        }
        fileReaderAdmin.close();
        return false;
    }

    @Override
    public void userDataWritten(MainEntity mainEntity) throws IOException {
        FileWriter newEntity = new FileWriter("./src/newEntity.txt", true);
        newEntity.write(String.format("%s \n", mainEntity.getName()));
        newEntity.write(String.format("%s \n", mainEntity.getSurname()));
        newEntity.write(String.format("%d \n", mainEntity.getAge()));
        newEntity.write(String.format("%s \n", mainEntity.getEmail()));
        newEntity.write(String.format("%s \n", mainEntity.getPassword()));
        newEntity.write(String.format("%s \n", mainEntity.getRole()));
        System.out.println("Done!");

        newEntity.close();
    }
}