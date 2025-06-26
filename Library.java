
public class User {
    private int User_id;
    private String  User_name;
    
    public User(int id, String name){
        this.User_id=id;
        this.User_name=name;
    }
    
    public int getUserId(){
        return User_id;
    }
    
    public String getUserName(){
        return User_name;
    }
    
    public String toString(){
        return ("User id  "+User_id+"\nUser Name  "+User_name);
    }
    
}
