import java.util.ArrayList;

public class CartItem{
   private ArrayList<Product> product;
   private  int currentquantity ;

   public int getCurrentquantity(){
       return  currentquantity ;
   }

   public  void setCurrentquantity(int currentquantity){
       this.currentquantity = currentquantity;
   }

    CartItem(ArrayList<Product> product){
       this.product = product;
       currentquantity = 1;
    }

}