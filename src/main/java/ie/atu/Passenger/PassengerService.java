package ie.atu.Passenger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class PassengerService {
    public List<Passenger> getPassengers(){
        DummyData data = new DummyData();
        List<Passenger> list = List.of(
                new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge()),
                new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge()),
                new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge()),
                new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge()),
                new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge()),
                new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge()),
                new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge()));
        return list;
    }
    public Passenger getPassenger(@PathVariable String Passengerage){
        DummyData data = new DummyData();
        Passenger myPassenger = new Passenger(data.setDummyTitle(), data.setDummyName(), data.setDummyID(), data.setDummyPhoneNum(), data.setDummyAge());
        return myPassenger;
    }
}
