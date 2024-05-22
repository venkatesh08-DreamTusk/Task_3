public class Products {
    private String pID;
    private String pName;
    private double pPrice;
    private int    pStock;


    public String getpID(){
        return pID;
    }
    public String getpName(){
        return pName;
    }
    public  double getpPrice(){
        return pPrice;
    }
    public int getpStock(){
        return pStock;
    }

    public  void setpStock(int stock){
        pStock = stock;
    }

    Products(String id,String name,double price,int stock){
        this.pID = id;
        this.pName = name;
        this.pPrice = price;
        this.pStock = stock;
    }

    public String toString(){
        return "Product ID : "+"' "+ pID+" '"+"  |  "+
                "Product Name : "+"' "+pName+" '"+"  |  "+
                "Product Price : "+"' "+pPrice+" '"+"  |  "+
                "Product Stock : "+"' "+pStock+" '";
    }

}