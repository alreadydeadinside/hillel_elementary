package actions;

public interface FourthAction {

    void printActionFour(String string);

    void showPrice(int price);

    static void upper(String string) {
        System.out.println("FourthAction: String to upper case: " + string.toUpperCase());
    }

    default int getLength(String string) {
        return string.length() * 8;
    }
}