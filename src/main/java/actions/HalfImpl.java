package actions;

public class HalfImpl implements FirstAction, SecondAction {
    @Override
    public void printActionOne(String string) {
        System.out.println("FirstAction: print: " + string);
    }

    @Override
    public void showNumber(int number) {
        System.out.println("FirstAction: number: " + number);
    }

    @Override
    public void printActionTwo(String string) {
        System.out.println("SecondAction: print: " + string);
    }

    @Override
    public void showSize(int size) {
        System.out.println("SecondAction: size: " + size);
    }

    @Override
    public int getLength(String string) {
        return string.length();
    }
}