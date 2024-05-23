import java.util.*;
public  class LoginManager {

    private final Scanner in = new Scanner(System.in);
    UserDataBase user = UserDataBase.getInstance();



    LoginManager(){

    }
    public  void login(){
        user.usersDetails();
        System.out.println("Give ID");
        String userId = in.next();
        if(verifyUserID(userId)){
            CartManager cartManager = new CartManager(user.getUserById(userId));
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
