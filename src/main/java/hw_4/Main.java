package hw_4;

import entities.Client;
import java.util.Scanner;
import utils.ErrorAndExceptionsHelper;
import exceptions.*;
import services.*;

public class Main {

    public static void main(String[] args) {

        ErrorAndExceptionsHelper errorAndExceptionsHelper = new ErrorAndExceptionsHelper();
        Client client = new Client();
        Client newClient = new Client();




        boolean isFieldValid = false;
        do {
            System.out.println("Enter First Client Account ID: ");
            Scanner scanner = new Scanner(System.in);
            String clientAccId = scanner.nextLine();
            try {
                errorAndExceptionsHelper.fieldClientIdCheck(clientAccId);
                isFieldValid = true;
                client.setClientAccountID(clientAccId);
                System.out.println(client);
            } catch (WrongFieldException e) {
                System.out.println(e.getMessage());
                System.out.println("Wrong ID 1");
            }
        }
        while (!isFieldValid);
        {
            System.out.println("ID 1 accepted");

        }
        boolean isFieldValid2 = false;
        do {
            System.out.println("Enter Second Client Account ID: ");
            Scanner scanner = new Scanner(System.in);
            String clientAccId2 = scanner.nextLine();
            try {
                errorAndExceptionsHelper.fieldClientIdCheck(clientAccId2);
                isFieldValid2 = true;
                newClient.setClientAccountID(clientAccId2);
                System.out.println(newClient);
            } catch (WrongFieldException e) {
                System.out.println(e.getMessage());
                System.out.println("Wrong ID 2");
            }
        }
        while (!isFieldValid2);
        {
            System.out.println("ID 2 accepted");

        }
        boolean isFieldValid3 = false;

        do {
            System.out.println("Enter value of money to transact: ");
            Scanner scanner = new Scanner(System.in);
            float someSum = Float.parseFloat(scanner.nextLine());
            try {
                ErrorAndExceptionsHelper.sumCheck(someSum);
                isFieldValid3 = true;
            } catch (WrongSumException e) {
                System.out.println(e.getMessage());
                System.out.println("Wrong sum, check condition.");
            }
        } while (!isFieldValid3);
        System.out.println("ID 2 accepted");

        String clientAccountID2Validation = newClient.getClientAccountID();
        TransactionService.moneyTransfer(clientAccountID2Validation, client);
    }
}
