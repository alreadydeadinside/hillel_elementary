package lesson20;

import lesson20.utils.LoggerUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
   static Logger logger = LoggerUtil.getLogger(Main.class);
    public static void main(String[] args) {
        logger.log(Level.INFO, "Some Error");
       // System.err.println("Error message from lesson 20");
    }
}
