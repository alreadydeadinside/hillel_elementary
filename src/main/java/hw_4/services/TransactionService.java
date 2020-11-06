package hw_4.services;

import entities.Client;
import utils.ErrorAndExceptionsHelper;

public class TransactionService {
    public static void moneyTransfer(String arrivedId, Client client){
        ErrorAndExceptionsHelper helper = new ErrorAndExceptionsHelper();
        helper.clientIdCheck(client.getClientAccountID(),arrivedId);
        System.out.println("Operation completely done!");
    }
}
