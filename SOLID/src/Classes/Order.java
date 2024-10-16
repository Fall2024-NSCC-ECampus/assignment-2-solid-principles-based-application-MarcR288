package Classes;

public class Order {
    private int orderID;
    private int customerID;
    private int productID;
    private int quantity;
    private String deliverDetails;
    private String nonDeliverDetails;


    public Order(int orderID, int customerID, int productID, int quantity, String deliverDetails, String nonDeliverDetails) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.productID = productID;
        this.quantity = quantity;
        this.deliverDetails = deliverDetails;
        this.nonDeliverDetails = nonDeliverDetails;
    }

    public void placeOrder() {

    }

    public void cancelOrder(){

    }

    public String getOrderStatus(){
        return null;
    }
}
