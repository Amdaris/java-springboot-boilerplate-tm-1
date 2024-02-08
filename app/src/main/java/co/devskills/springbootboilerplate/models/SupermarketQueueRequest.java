package co.devskills.springbootboilerplate.models;

public class SupermarketQueueRequest {
    private int[] customers;
    private int selfCheckoutPoints;

    // Default constructor
    public SupermarketQueueRequest() {
    }

    // Constructor with parameters
    public SupermarketQueueRequest(int[] customers, int selfCheckoutPoints) {
        this.customers = customers;
        this.selfCheckoutPoints = selfCheckoutPoints;
    }

    // Getter and setter methods for customers
    public int[] getCustomers() {
        return customers;
    }

    public void setCustomers(int[] customers) {
        this.customers = customers;
    }

    // Getter and setter methods for selfCheckoutPoints
    public int getSelfCheckoutPoints() {
        return selfCheckoutPoints;
    }

    public void setSelfCheckoutPoints(int selfCheckoutPoints) {
        this.selfCheckoutPoints = selfCheckoutPoints;
    }
}