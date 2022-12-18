package ie.atu.Passenger;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {
    PassengerService myService;
    private final PassengerRepo passengerRepo;
    public PassengerController(PassengerService myService, PassengerRepo passengerRepo) {
        this.myService = myService;
        this.passengerRepo = passengerRepo;
    }
    @GetMapping
    public List<Passenger> getPassengers(){
        return myService.getPassengers();
    }
    @GetMapping("/{PassengerID}")
    public Passenger getPassenger(@PathVariable String PassengerID){
        return myService.getPassenger(PassengerID);
    }

    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger){
        myService.savePassenger(passenger);
    }
    @GetMapping("/name/{UserName}")
    public Passenger getPassengerName(@PathVariable("UserName") String name){
        return myService.findPassengerByName(name);
    }
    @DeleteMapping("/delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count){
        myService.deletePassenger(count);
    }
    //http://localhost:8081/anpi/passeger/age?age_start=1&age_end=60
    @GetMapping("/age")
    public  List<Passenger> findPassengerByAgeRange(@RequestParam(name = "age_start") int age1, @RequestParam(name = "age_end") int age2){
        return myService.findPassengerByAge(age1,age2);
    }
}
