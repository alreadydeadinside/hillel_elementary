import actions.*;
import functional.ConsumerInterface;
import functional.FunctionInterface;
import functional.PredicateInterface;
import functional.SupplierInterface;
import utils.Helper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FirstAction.move(300);
        SecondAction.countSum(51, 22);
        HalfImpl firstActions = new HalfImpl();
        firstActions.printActionOne("1");
        firstActions.printActionTwo("2");
        firstActions.showNumber(105);
        firstActions.showSize(200);
        int name = firstActions.getLength("Bohdan");
        System.out.println("Name length: " + name);

        ThirdAction.trim("   test for trim ");
        FourthAction.upper(" uppercase test");
        RestImpl secondActions = new RestImpl();
        secondActions.printActionThree("3");
        secondActions.printActionFour("4");
        secondActions.showPlace(5);
        secondActions.showPrice(1500);
        int surname = secondActions.getLength("Vakaliuk");
        System.out.println("Surname length: " + surname);

        Helper helper = new Helper();
        System.out.println(helper.checkEmail("brytong@ukr.net"));
        System.out.println(helper.checkEmail("wrongemail"));

        PredicateInterface<Double> predicateInterface = (val) -> val > 1500.0;
        boolean resultPredicateDouble = predicateInterface.check(3000.0);
        System.out.println("resultPredicateDouble: " + resultPredicateDouble);

        ConsumerInterface<String> consumerInterface = (str) -> {
            char[] result = str.toCharArray();
            return result;
        };
        System.out.println("resultConsumer: " + Arrays.toString(consumerInterface.accept("TEST")));

        FunctionInterface<Integer, String> functionInterface = (i) -> {
            switch (i) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                case 10:
                    return "ten";
                default:
                    return "unknown";
            }
        };
        String convert = functionInterface.convert(9);
        System.out.println("functionInterfaceResult: " + convert);

        SupplierInterface<String> supplierInterface = () -> "SAMPLE TEXT";
        String text = supplierInterface.get();
        System.out.println("supplierInterfaceResult: " + text);
    }
}