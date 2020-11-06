package hw_4.entities;

public class Client {
    private String clientID;
    private String lastName;
    private String clientAccountID;
    private float someSum;

    public Client() {

    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClientAccountID() {
        return clientAccountID;
    }

    public void setClientAccountID(String clientAccountID) {
        this.clientAccountID = clientAccountID;
    }

    public float getSomeSum() {
        return someSum;
    }

    public void setSomeSum(float someSum) {
        this.someSum = someSum;
    }
}
