import java.util.ArrayList;

public  class UserDataBase {
    ArrayList<SeparateUser> users = new ArrayList<>();

    private static  UserDataBase userDataBase;

   private UserDataBase(){

    }

    public   static  UserDataBase getInstance(){
       if(userDataBase == null){
           userDataBase = new UserDataBase();
       }
                return userDataBase;
    }

    public void usersDetails(){
        SeparateUser uset1 = new SeparateUser("s01",new Cart());
        users.add(uset1);
        SeparateUser uset2 = new SeparateUser("v02",new Cart());
        users.add(uset2);
        SeparateUser uset3 = new SeparateUser("v03",new Cart());
        users.add(uset3);
    }

    public SeparateUser getUserById(String userID){
       for(SeparateUser user : userDataBase.users){
           if(userID.equals(user.getUserID())){
               return user;
           }
       }
       return null;
    }
}