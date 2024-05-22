public  class SeparateUser {
    private String userID;
    Cart cart;

    public  String getUserID(){
        return  userID;
    }

    SeparateUser(String id ,Cart cart){
        this.userID = id;
        this.cart   = cart;
    }

}