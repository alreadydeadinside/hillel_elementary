package actions;

public interface FirstAction {

    void printActionOne(String string);

    void showNumber(int number);

    static void move(int distance) {
        System.out.println("FirstAction: Moved by distance: " + distance);
    }

    default int getLength(String string) {
        return string.length() * 2;
    }
}