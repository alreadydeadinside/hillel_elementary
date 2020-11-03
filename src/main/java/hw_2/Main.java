package hw_2;

public class Main {
    public static void main(String[] args) {
        Information information = new Information();
        InitializationData initializationData = new InitializationData();
        initializationData.fillingInfo(information);
        System.out.println("Result: " + information);
    }
}