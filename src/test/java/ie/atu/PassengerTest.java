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
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}