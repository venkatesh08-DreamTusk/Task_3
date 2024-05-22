import java.util.*;
public  class LoginManager {

    Scanner in = new Scanner(System.in);
    UserDataBase user = UserDataBase.getInstance();
    CartManager cartManager;

    LoginManager(){

        this.cartManager = new CartManager();

    }
    public  void login(){
        user.usersDetails();
        System.out.println("Give ID");
        String userId = in.next();
        if(verifyUserID(userId)){
            cartManager.askRequest(userId);
              login();
        }else {
            System.out.println("ID is Wrong Give Correct User ID");
            login();
        }
    }



    public  boolean verifyUserID(String userId){
        for(User user : user.getUsers()){
            if(userId.equals(user.getUserID())){
                return  true;
            }
        }
        return  false;
    }

}
