package actions;

public interface SecondAction {

    void printActionTwo(String string);

    void showSize(int size);

    static void countSum(int first, int second) {
        System.out.println("SecondAction: Count (a+b): " + (first + second));
    }

    default int getLength(String string) {
        return string.length() * 4;
    }
}