package DataMode;

import io.objectbox.annotation.Entity;

@Entity
public class UserData {
    public int userId;
    public String userName;

    public int getUserId(){return userId;}
    public void setUserId(int userId){this.userId=userId;}

    public String getUserName(){return userName;}
    public void setUserName(String userName){this.userName=userName;}

}