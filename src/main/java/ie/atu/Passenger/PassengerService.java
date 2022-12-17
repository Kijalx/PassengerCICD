package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {
    private final PassengerRepo passengerRepo;
    List<Passenger> list = new ArrayList<>();
    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }
    public Passenger getPassenger(@PathVariable String PassengerID){
        DummyData data = new DummyData();
        Passenger myPassenger = new Passenger(data.setDummyTitle(), data.setDummyName(), PassengerID, data.setDummyPhoneNum(), data.setDummyAge());
        return myPassenger;
    }
}
