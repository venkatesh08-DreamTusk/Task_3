

public class CartItem {
    private Product product;
    private int currentquantity;
    private  double totalPrice;

    public double totalprice(){
        this.totalPrice = getProduct().getpPrice()*getCurrentquantity();
             return totalPrice;
    }


    CartItem(Product product) {
        this.product = product;
        currentquantity = 1;
    }

    public  Product getProduct(){
        return product;
    }

    public int getCurrentquantity() {
        return currentquantity;
    }

    public void setCurrentquantity(int currentQuantity) {
        this.currentquantity = currentQuantity;
    }

    public String toString(){
        return "Product ID : "+getProduct().getpID()+" "+"|"+" "+
                "Product Name : "+getProduct().getpName()+" "+"|"+" "+
                "Product Price : "+getProduct().getpPrice()+" "+"|"+" "+
                "Product Quantity : "+getCurrentquantity()+" "+"|"+" "+
                "Total Price : "+totalprice();
    }



}