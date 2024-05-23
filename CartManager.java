import java.util.Arrays;
import java.util.Scanner;
public class CartManager {
    Scanner in = new Scanner(System.in);
    ProductDataBase productList = ProductDataBase.getInstance();
    private final Cart cart;
    User user;

    CartManager(User users) {
        user = users;
        cart = new Cart();
        askRequest();
    }

    public void askRequest() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Hi "+user.getName());
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
                viewProduct();
                break;
            case 2:
                if (cart.viewCart(user)) {
                    double totalPrice = 0;
                    for (CartItem item: user.cart.cartItem) {
                        totalPrice += item.totalprice();
                        System.out.println(item);
                    }
                    System.out.println("Total Price : "+ totalPrice);
                } else {
                    System.out.println("Cart is Empty...");
                }
                break;
            case 3:
                System.out.println("Enter Product ID");
                String pId = in.next();
                if (cart.addItem(pId,user)) {
                    System.out.println("Product Added Successfully...");
                } else {
                    System.out.println("Product Not Exists...");
                }
                break;
            case 4:
                System.out.println("Enter Product ID");
                String pID = in.next();
                if (!cart.removeItem(pID,user)) {
                    System.out.println("Item Not Exists...");
                } else {
                    System.out.println("Item Successfully Removed...");
                }
                break;
            case 5:
                System.out.println("Give Product ID");
                String pid = in.next();
                System.out.println("Give Product Quantity");
                int quantity = in.nextInt();
                if(cart.updateQuantity(pid,user,quantity)){
                    System.out.println("Quantity Updated...");
                }else {
                    System.out.println("Product Not Exists...");
                }

                break;
            case 6:
                return;
            default:
                System.out.println("Give Valid Option Number");
                break;
        }

        askRequest();

    }

    public void viewProduct() {
        for (Product products : productList.products) {
            System.out.println(products);
        }

    }


}