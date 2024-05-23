import java.util.*;

public class Cart {
    Scanner in = new Scanner(System.in);
    ArrayList<Product> cartProducts;
    ProductDataBase productList;
    CartItem cartItem;



    Cart(){
        cartProducts = new ArrayList<>();
        productList = ProductDataBase.getInstance();
        cartItem = new CartItem(cartProducts);

    }

    public boolean viewCart(User user){

        return !user.cart.cartProducts.isEmpty();
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
           user.cart.cartProducts.add(productsToAdd);
           return true;
       }
       return false;
    }


    public  boolean removeItem(String pId,User user){
              return  user.cart.cartProducts.removeIf(product -> pId.equals(product.getpID()));
    }


    public boolean updateQuantity(String pID, User user , int quantity){
        for(Product product :user.cart.cartProducts ){
            if(!pID.equals(product.getpID())){
                return  false;
            }
        }
        user.cart.cartItem.setCurrentquantity(quantity);
        return true;
    }


}