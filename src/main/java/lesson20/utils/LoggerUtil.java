package lesson20.utils;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerUtil {
    public static <T>Logger getLogger(Class<T> tClass){
        try{
            LogManager.getLogManager().readConfiguration(tClass.getResourceAsStream("log/"));
        }

    }
}
