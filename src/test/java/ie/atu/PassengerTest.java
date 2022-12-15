/*
 * Aleksander Kijewski
 * G00396018
 * Java Personal Assignment // Test File
 */
package ie.atu;

import ie.atu.App.Passenger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor(){ // Tests the constructor if everything is correct
        Passenger newPassenger = new Passenger("Mr","Aleks","123JHGE25D2","0834552813",21); // Creates a passenger object
        assertEquals("Mr", newPassenger.getPassengerTitle()); // Checks User's Title if Mr
        assertEquals("Aleks", newPassenger.getPassengerName()); // Checks User's Name
        assertEquals("123JHGE25D2", newPassenger.getPassengerUserID()); // Checks User's ID
        assertEquals("0834552813", newPassenger.getPassengerPhoneNumber()); // Checks User's Phone Number
        assertEquals(21, newPassenger.getPassengerAge()); // Checks User's Age
    }

    @Test
    void testConstructorMrs(){ // Tests the constructor with Mrs as title
        Passenger newPassenger = new Passenger("Mrs","Aleks","123JHGE25D2","0834552813",21);
        assertEquals("Mrs", newPassenger.getPassengerTitle()); // Checks User's Title if Mrs
    }

    @Test
    void testConstructorMs(){ // Tests the constructor with Ms as title
        Passenger newPassenger = new Passenger("Ms","Aleks","123JHGE25D2","0834552813",21);
        assertEquals("Ms", newPassenger.getPassengerTitle()); // Checks User's Title if Mr
    }

    @Test
    void testTitleFail(){ // Tests when the title is incorect
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("sdgs","Aleks","123JHGE25D2","0834552813",21));
        assertEquals("This is not a valid title", exMessage.getMessage()); // Collects exception error
    }

    @Test
    void testNameFail(){ // Tests when the name is incorect length
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","fa","123JHGE25D2","0834552813",21));
        assertEquals("This is not a valid name must be 3 or more characters", exMessage.getMessage());
    }

    @Test
    void idFail(){ // Tests when the ID is incorect length
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","Aleks","1234","0834552813",21));
        assertEquals("ID must be at least 10 characters", exMessage.getMessage());
    }

    @Test
    void phoneNumberFail() { // Tests when the phone number is incorect length
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","Aleks","123JHGE25D2","083455",21));
        assertEquals("Phone Number must be at least 7 characters", exMessage.getMessage());
    }

    @Test
    void ageFail(){ // Tests when the age is too low
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","Aleks","123JHGE25D2","0834552813",12));
        assertEquals("Passenger must be over 16 to fly.", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}