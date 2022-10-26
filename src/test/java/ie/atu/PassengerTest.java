package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @org.junit.jupiter.api.BeforeEach
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
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Passenger("sdgs","Aleks","123JHGE25D2","0834552813",21);});
        assertEquals("This is not a valid title", exMessage.getMessage());
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}