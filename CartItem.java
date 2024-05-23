

public class CartItem {
    private Product product;
    private int quantity;


    public double totalprice(){
             return getProduct().getpPrice()*getCurrentquantity();
    }


    CartItem(Product product) {
        this.product = product;
        quantity = 1;
    }

    public  Product getProduct(){
        return product;
    }

    public int getCurrentquantity() {
        return quantity;
    }

    public void setCurrentquantity(int currentQuantity) {
        this.quantity = currentQuantity;
    }

    public String toString(){
        return "Product ID : "+getProduct().getpID()+" "+"|"+" "+
                "Product Name : "+getProduct().getpName()+" "+"|"+" "+
                "Product Price : "+getProduct().getpPrice()+" "+"|"+" "+
                "Product Quantity : "+getCurrentquantity()+" "+"|"+" "+
                "Total Price : "+totalprice();
    }



}