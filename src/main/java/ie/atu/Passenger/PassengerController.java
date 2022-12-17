package ie.atu.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {
    PassengerService myService;

    public PassengerController(PassengerService myService) {
        this.myService = myService;
    }
    @GetMapping
    public List<Passenger> getPassengers(){
        return myService.getPassengers();
    }
    @GetMapping("/{PassengerID}")
    public Passenger getPassenger(@PathVariable String PassengerID){
        return myService.getPassenger(PassengerID);
    }
}
