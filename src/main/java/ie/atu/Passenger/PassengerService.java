package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger){
        passengerRepo.save(passenger);
    }
}
