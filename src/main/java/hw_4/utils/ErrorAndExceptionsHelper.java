package hw_4.utils;

import exceptions.UserExpectedError;
import exceptions.WrongFieldException;
import exceptions.WrongSumException;

public class ErrorAndExceptionsHelper {
    public void fieldClientIdCheck(String clientId) throws WrongFieldException {
        if(clientId.length() != 10){
            throw new WrongFieldException();
        }
    }

    public static void sumCheck(float someSum) throws WrongSumException {
        if (someSum > 1000f){
            throw new WrongSumException();
        }

    }

    public void clientIdCheck(String sentId, String arrivedId) throws UserExpectedError {
        if(!sentId.equals(arrivedId)){
            throw new UserExpectedError();
        }
    }
}
