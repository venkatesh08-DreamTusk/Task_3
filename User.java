public  class User {
    private String userID;
    Cart cart;

    public  String getUserID(){
        return  userID;
    }

    User(String id ,Cart cart){
        this.userID = id;
        this.cart   = cart;
    }

}