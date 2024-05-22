import java.util.Scanner;
public class CartManager {
    Scanner in = new Scanner(System.in);
    ProductList productList = ProductList.getObject();
    Cart cart;

    CartManager(){
        cart = new Cart();
    }
    public  void askRequest(String userID) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("View Products           ---> press '1' ");
        System.out.println("View Cart               ---> press '2' ");
        System.out.println("Add Product to Cart     ---> press '3' ");
        System.out.println("Remove Product to Cart  ---> press '4' ");
        System.out.println("Update Product Quantity ---> press '5' ");
        System.out.println("Log Out                 ---> press '6' ");
        System.out.println("---------------------------------------------------------------------------------");

        int num = in.nextInt();

        switch (num) {
            case 1:
                viewmenuProduct(userID);
                break;
            case 2:
                viewUserCart(userID);
                break;
            case 3:
                addItem(userID);
                break;
            case 4:
                removeItem(userID);
                break;
            case 5:
                updateQuantity(userID);
                break;
            case 6:
                return;
            default:
                System.out.println("Give Valid Option Number");
                break;
        }


    }
    public void viewmenuProduct(String userID){
        for (Products products : productList.products) {
            System.out.println(products);
        }
        askRequest(userID);
    }

    public void viewUserCart (String userID) {
        cart.viewCart(userID);
        askRequest(userID);
    }

    public void addItem(String userID) {
        cart.addItem(userID);
        askRequest(userID);
    }

    public void removeItem(String userID){
        cart.removeItem(userID);
        askRequest(userID);

    }
    public void updateQuantity(String userID){
        cart.updateProductQuantity(userID);
        askRequest(userID);

    }

}