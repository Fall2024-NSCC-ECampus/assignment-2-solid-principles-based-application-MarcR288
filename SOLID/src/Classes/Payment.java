package Classes;

import Interfaces.PaymentProcessor;
import Interfaces.RefundProcessor;

import java.io.Serializable;

public class Payment implements PaymentProcessor, RefundProcessor {
    private int paymentID;
    private int orderID;
    private double amount;
    private String paymentType;
    private String paymentStatus;

    public Payment(int paymentID, int orderID, double amount, String paymentType, String paymentStatus) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.amount = amount;
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
    }

    public void processPayment(){

    }

    public void processRefund(){

    }

    public String getPaymentStatus(int orderID){
        return null;
    }

}
