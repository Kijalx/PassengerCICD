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

    public void setUserID(String idofuser){
        if(idofuser.length() >= 10){
            userID = idofuser;
        }
        else {
            throw new IllegalArgumentException("ID must be at least 10 characters");
        }
    }
    public String getPassengerUserID(){
        return userID;
    }

    public void setPhoneNumber(String phnum)
    {
        if(phnum.length() >= 7){
            userPhoneNum = phnum;
        }
        else{
            throw new IllegalArgumentException("Phone Number must be at least 7 characters");
        }
    }
    public String getPassengerPhoneNumber(){
        return userPhoneNum;
    }

    public void setAge(int ageofuser){
        if(ageofuser > 16){
            userAge = ageofuser;
        }
        else{
            throw new IllegalArgumentException("Passenger must be over 16 to fly.");
        }
    }
    public int getPassengerAge(){
        return userAge;
    }
}
