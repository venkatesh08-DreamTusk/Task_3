import java.util.ArrayList;

public class ProductDataBase {
    ArrayList<Product> products ;


    private  ProductDataBase(){
        this.products = new ArrayList<>();
        this.productDetails();

    }
    private  static ProductDataBase productList;

    public static ProductDataBase getInstance(){
        if(productList == null){
            productList = new ProductDataBase();
        }
        return productList;
    }



    private  void productDetails(){
        Product products1 = new Product("p1","Pencil",15.00,10);
        Product products2 = new Product("p2","pen",20.00,30);
        Product products3 = new Product("p3","Eraser",10.00,20);
        products.add(products1);
        products.add(products2);
        products.add(products3);
    }


}