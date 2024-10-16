package Classes;

public class Product {
    private int productID;
    private String productName;
    private double productPrice;
    private int productQuantity;


    public Product(int productID, String productName, double productPrice, int productQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }


    public String getProductDetails(){
        return null;
    }

    public void updateProduct(){
        return;
    }

    public int getProductID() {
        return productID;
    }


}
