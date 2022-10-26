package ie.atu;

public class Passenger {
    String userTitle;
    String userName;
    String userID;
    String userPhoneNum;
    int userAge;

    public Passenger(String title, String name, String id, String phoneNum, int age){
        setTitle(title);
        setName(name);
        setUserID(id);
        setPhoneNumber(phoneNum);
        setAge(age);
    }

    public void setTitle(String title){
        if(title.equalsIgnoreCase("Mr") || title.equalsIgnoreCase("Mrs") || title.equalsIgnoreCase("Ms"))
        {
            userTitle = title;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid title");
        }
    }
    public String getPassengerTitle(){
        return userTitle;
    }

    public void setName(String nameofuser){
        if(nameofuser.length() >= 3){
            userName = nameofuser;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name must be 3 or more characters");
        }
    }
    public String getPassengerName(){
        return userName;
    }
}
