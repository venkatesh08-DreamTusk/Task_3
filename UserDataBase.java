import java.util.ArrayList;

public  final  class UserDataBase {
    private  ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

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
       User uset1 = new User("s01",new Cart());
        users.add(uset1);
        User uset2 = new User("v02",new Cart());
        users.add(uset2);
        User uset3 = new User("v03",new Cart());
        users.add(uset3);
    }

    public User getUserById(String userID){
       for(User user : userDataBase.users){
           if(userID.equals(user.getUserID())){
               return user;
           }
       }
       return null;
    }
}