package ie.atu.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    public Passenger findPassengerByUserName(String name);

    @Query("SELECT p FROM Passenger p WHERE p.userAge > ?1 and p.userAge < ?2")
    public List<Passenger> findPassengerByUserAge(int age, int age2);
}
