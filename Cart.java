import java.util.*;

public class Cart {
    Scanner in = new Scanner(System.in);
    ArrayList<Products> cartProducts;
    UserDataBase userDataBase;
    ProductList productList;

    Cart(){
        cartProducts = new ArrayList<>();
        userDataBase = UserDataBase.getInstance();
        productList = ProductList.getObject();
    }

    public void viewCart(String userID){
        SeparateUser users = userDataBase.getUserById(userID);
        if(users != null){
            if(users.cart.cartProducts.isEmpty()){
                System.out.println("Cart is Empty...");
            }else {
                for(Products products : users.cart.cartProducts){
                    System.out.println(products);
                }
            }
        }else {
            System.out.println("Invalid User ID");
        }
    }

    public  void addItem(String userID){
        System.out.println("Give Product ID");
        String pid = in.next();
        SeparateUser user = userDataBase.getUserById(userID);
           if(user != null){
            addItemtoParticularuserCart(pid,user);
        }else {
            System.out.println("Invalid User ID");
        }
    }

    public void addItemtoParticularuserCart(String pId, SeparateUser user){

        Products productsToAdd = null;
        for(Products products : productList.products){
            if(pId.equals(products.getpID())){
                productsToAdd = products;
                break;
            }
        }
        if(productsToAdd != null) {
            user.cart.cartProducts.add(productsToAdd);
            System.out.println("Successfully product added...");
        }else {
            System.out.println("Product is Unavailable ");
        }
    }

    public  void removeItem(String userId){
        System.out.println("Give Product ID");
        String pID = in.next();

        SeparateUser user = userDataBase.getUserById(userId);
        if(user != null){
            removeItemfromParticularuserCart(pID,user);
        }else {
            System.out.println("Invalid User ID");
        }
}


    public  void removeItemfromParticularuserCart(String pId, SeparateUser userCart){
                        boolean removed = userCart.cart.cartProducts.removeIf(products -> pId.equals(products.getpID()));
                if(removed){
                    System.out.println("Removed Successfully");
                }else{
                    System.out.println("Sorry...This Product Unavailable in Your Cart");
                }
    }

    public void updateProductQuantity(String userID){
        System.out.println("Give Product ID");
        String pID = in.next();
        SeparateUser user = userDataBase.getUserById(userID);
        if(user != null){
            updateProductQuantityOptions(pID,user);
        }else {
            System.out.println("Invalid User ID");
        }
    }
    public  void updateProductQuantityOptions(String pId, SeparateUser user) {

        for(Products products : user.cart.cartProducts ){
            if(pId.equals(products.getpID())){
                System.out.println("If You Add Existing Product Quantity    ---> press '1' ");
                System.out.println("If You Reduce Existing Product Quantity ---> press '2' ");
                int number = in.nextInt();

                if(number < 1 || number >2){
                    System.out.println("Give Correct Option Number");
                }

                if(number == 1){
                    updateIncrement(pId,user);
                }else if(number == 2){
                    updateDecrement(pId,user);
                }else {
                    System.out.println("Give Correct Option");
                }
            }
        }
    }


    public  void updateIncrement(String pId, SeparateUser user){
        System.out.println("How much would you Increase...Give in Integer");
        int number = in.nextInt();

        for(Products products : user.cart.cartProducts){
            products.setpStock(products.getpStock() + number);
        }

    }

    public void updateDecrement(String pId, SeparateUser user) {
        System.out.println("How much would you Decrease...Give in Integer");
        int number = in.nextInt();
        for(Products products : user.cart.cartProducts){
            products.setpStock(products.getpStock() - number);
        }
    }




}