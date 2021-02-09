package actions;

public class RestImpl implements ThirdAction, FourthAction {
    @Override
    public void printActionFour(String string) {
        System.out.println("ThirdAction print: " + string);
    }

    @Override
    public void showPrice(int price) {
        System.out.println("ThirdAction price:" + price);
    }

    @Override
    public void printActionThree(String string) {
        System.out.println("FourthAction print:" + string);
    }

    @Override
    public void showPlace(int place) {
        System.out.println("FourthAction place: " + place);
    }

    @Override
    public int getLength(String string) {
        return string.length() + 100;
    }
}