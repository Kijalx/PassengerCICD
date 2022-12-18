package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {
    private final PassengerRepo passengerRepo;
    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }
    public Passenger getPassenger(String PassengerID){
        Passenger myPassenger = new Passenger("Mr", "Aleks Kijewski", "12345678901", "0834552813123", 21);
        return myPassenger;
    }
    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }
    public Passenger findPassengerByName(String name){
        return passengerRepo.findPassengerByUserName(name);
    }
    public void deletePassenger(Long count){
        passengerRepo.deleteById(count);
    }
    //http://localhost:8081/api/passenger/age?age_start=1&age_end=60

    public  List<Passenger> findPassengerByAge(int age1, int age2){
        return passengerRepo.findPassengerByUserAge(age1,age2);
    }
}
