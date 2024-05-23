import java.util.*;

public class Cart {
    Scanner in = new Scanner(System.in);
    ProductDataBase productList;
   ArrayList <CartItem> cartItem;



    Cart(){
        cartItem = new ArrayList<>();
        productList = ProductDataBase.getInstance();


    }

    public boolean viewCart(User user){

        return !user.cart.cartItem.isEmpty();
    }

    public  boolean addItem(String pID, User user){
        Product productsToAdd = null;
       for(Product product : productList.products){
           if(pID.equals(product.getpID())){
               productsToAdd = product;
               break;

           }
       }
       if(productsToAdd != null){
           CartItem item = new CartItem(productsToAdd);
           user.cart.cartItem.add(item);
           return true;
       }
       return false;
    }


    public boolean removeItem(String pId, User user) {
        Iterator<CartItem> cartItemIterator = user.cart.cartItem.iterator();
        while (cartItemIterator.hasNext()) {
            CartItem cartItem = cartItemIterator.next();
            if (pId.equals(cartItem.getProduct().getpID())) {
                cartItemIterator.remove();
                return true;
            }
        }
        return false;
    }



    public boolean updateQuantity(String pID, User user , int quantity){
        for(CartItem item :user.cart.cartItem ){
            if(pID.equals(item.getProduct().getpID())){
                item.setCurrentquantity(quantity);
                return  true;
            }
        }
        return false;
    }


}