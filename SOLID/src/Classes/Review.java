package Classes;

public class Review {
    public int reviewID;
    public int productID;
    public int customerID;
    public double rating;
    public String comment;

    public Review(int reviewID, int productID, int customerID, double rating, String comment) {
        this.reviewID = reviewID;
        this.productID = productID;
        this.customerID = customerID;
        this.rating = rating;
        this.comment = comment;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void submitReview(){
    }

    public void getReview(int reviewID){
    }
}
