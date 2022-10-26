/*
 * Aleksander Kijewski
 * G00396018
 * Java Personal Assignment // Test Driven File
 */
package ie.atu;

public class Passenger {
    /* Creates local variables*/
    private String userTitle;
    private String userName;
    private String userID;
    private String userPhoneNum;
    private int userAge;

    /* Constructor */
    public Passenger(String title, String name, String id, String phoneNum, int age){
        setTitle(title);
        setName(name);
        setUserID(id);
        setPhoneNumber(phoneNum);
        setAge(age);
    }

    /* Setter for UserTitle */
    private void setTitle(String title){
        if(title.equalsIgnoreCase("Mr") || title.equalsIgnoreCase("Mrs") || title.equalsIgnoreCase("Ms")){ // Checks if imputted title is correct
            userTitle = title; // Sets UserTitle
        }
        else { // If title is incorrect
            throw new IllegalArgumentException("This is not a valid title"); // Outputs an error
        }
    }
    /* Getter for UserTitle */
    public String getPassengerTitle() {
        return userTitle;
    }

    /* Setter for UserName */
    private void setName(String nameofuser) {
        if(nameofuser.length() >= 3) { // Checks if inputted name is the correct length
            userName = nameofuser; // Sets userName
        }
        else { // If length is incorrect
            throw new IllegalArgumentException("This is not a valid name must be 3 or more characters"); // Outputs an error
        }
    }
    /* Getter for UserName */
    public String getPassengerName() {
        return userName;
    }

    /* Setter for UserID */
    private void setUserID(String idofuser) {
        if(idofuser.length() >= 10) { // Checks length of User id
            userID = idofuser; // Sets userID
        }
        else { // If length of userid is incorrect
            throw new IllegalArgumentException("ID must be at least 10 characters"); // Outputs an error
        }
    }
    /* Getter for UserID */
    public String getPassengerUserID() {
        return userID;
    }

    /* Setter for UserPhoneNum */
    private void setPhoneNumber(String phnum) {
        if(phnum.length() >= 7) { // Checks length of Phone Number
            userPhoneNum = phnum; // Sets userPhoneNum
        }
        else { // If length of phone number is incorrect
            throw new IllegalArgumentException("Phone Number must be at least 7 characters"); // Outputs an error
        }
    }
    /* Getter for UserPhoneNum */
    public String getPassengerPhoneNumber() {
        return userPhoneNum;
    }

    /* Setter for UserAge */
    private void setAge(int ageofuser) {
        if(ageofuser > 16) { // Checks if users age is above a certain value
            userAge = ageofuser; // Sets userAge
        }
        else { // If age is below
            throw new IllegalArgumentException("Passenger must be over 16 to fly."); // Outputs an error
        }
    }
    /* Getter for UserAge */
    public int getPassengerAge() {
        return userAge;
    }
}
