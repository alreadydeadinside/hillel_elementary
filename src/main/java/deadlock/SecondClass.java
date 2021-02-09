package deadlock;

public class SecondClass {
    private FirstClass firstClass;

    public FirstClass getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    synchronized String getString() {
        return "Result from second class";
    }

    public synchronized String getStringFromFirstClass() {
        return firstClass.getString();
    }
}