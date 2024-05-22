import java.util.ArrayList;

public class ProductList {
    ArrayList<Products> products ;


    private  ProductList(){
        this.products = new ArrayList<>();
        this.productDetails();

    }
    private  static ProductList productList;

    public static ProductList getObject(){
        if(productList == null){
            productList = new ProductList();
        }
        return productList;
    }



    public  void productDetails(){
        Products products1 = new Products("p1","Pencil",15.00,10);
        Products products2 = new Products("p2","pen",20.00,30);
        Products products3 = new Products("p3","Eraser",10.00,20);
        products.add(products1);
        products.add(products2);
        products.add(products3);
    }


}