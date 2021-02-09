package actions;

public interface ThirdAction {

    void printActionThree(String string);

    void showPlace(int place);

    static void trim(String string) {
        System.out.println("ThirdAction: Trimmed string: " + string.trim());
    }

    default int getLength(String string) {
        return string.length() * 6;
    }


}