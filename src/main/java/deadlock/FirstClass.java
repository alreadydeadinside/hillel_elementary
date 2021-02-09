package deadlock;

public class FirstClass {
    private SecondClass secondClass;

    public SecondClass getSecondClass() {
        return secondClass;
    }

    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    synchronized String getString() {
        return "Result from first class";
    }

    public synchronized String getStringFromSecondClass() {
        return secondClass.getString();
    }
}