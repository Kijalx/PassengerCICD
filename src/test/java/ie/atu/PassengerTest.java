package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor(){
        Passenger newPassenger = new Passenger("Mr","Aleks","123JHGE25D2","0834552813",21);
        assertEquals("Mr", newPassenger.getPassengerTitle());
        assertEquals("Aleks", newPassenger.getPassengerName());
        assertEquals("123JHGE25D2", newPassenger.getPassengerUserID());
        assertEquals("0834552813", newPassenger.getPassengerPhoneNumber());
        assertEquals(21, newPassenger.getPassengerAge());
    }

    @Test
    void testConstructorMrs(){
        Passenger newPassenger = new Passenger("Mrs","Aleks","123JHGE25D2","0834552813",21);
        assertEquals("Mrs", newPassenger.getPassengerTitle());
    }

    @Test
    void testConstructorMs(){
        Passenger newPassenger = new Passenger("Ms","Aleks","123JHGE25D2","0834552813",21);
        assertEquals("Ms", newPassenger.getPassengerTitle());
    }

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("sdgs","Aleks","123JHGE25D2","0834552813",21));
        assertEquals("This is not a valid title", exMessage.getMessage());
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","fa","123JHGE25D2","0834552813",21));
        assertEquals("This is not a valid name must be 3 or more characters", exMessage.getMessage());
    }

    @Test
    void idFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","Aleks","1234","0834552813",21));
        assertEquals("ID must be at least 10 characters", exMessage.getMessage());
    }

    @Test
    void phoneNumberFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","Aleks","123JHGE25D2","083455",21));
        assertEquals("Phone Number must be at least 7 characters", exMessage.getMessage());
    }

    @Test
    void ageFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr","Aleks","123JHGE25D2","0834552813",12));
        assertEquals("Passenger must be over 16 to fly.", exMessage.getMessage());
    }
    
    @AfterEach
    void tearDown() {
    }
}