public  class User {
    private String userID;
    private String uName;

    Cart cart;

    public  String getUserID(){
        return  userID;
    }

    public  String getName(){
        return uName;
    }

    public  void setuName(String name){
        this.uName = name;
    }
    User(){

    }
    User(String id , String name, Cart cart){
        this.userID = id;
        this.uName = name;
        this.cart   = cart;
    }


}