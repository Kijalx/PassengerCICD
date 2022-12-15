package ie.atu.App;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
@Service
public class DummyData {
    List<Passenger> list = new ArrayList<Passenger>();
    Random rand = new Random();
    String userName, userTitle, userPhoneNum, userID;
    int userAge;
    private int num;
    int max = 1999999999;
    int min = 1000000000;
    String[] firstName = {"Richard","Mikaela","Caitlyn","Syed","Dani","Ismail","Felicity","Brayleigh","Karmen","Felix","Amberly","Alexavier","Mavis","Renata","Camron","Leyla","Saydee","Dashiell","Jamison","Demi","Drake","Cian","Maddison","Sawyer","Amina","Valerie","Ivey","Madilynn","Candace","Osman","John","Nolan","Valeria","Alexa","Anakin","Kaleb","Maite","Moira","Bradlee","Ryleigh"};
    String[] surname = {"Landers","Darby","Horton","Dawson","Devries","Dupree","Langley","Lauer","Buffington","Wall","Guevara","Milam","Pollock","George","Riley","Ambrose","McClanahan","McCormick","Early","Mercado","Carver","Hager","Rockwell","Bradford","Shannon","Broyles","Beaver","Zielinski","Navarro","Kilpatrick","Caron","Bean","Cuevas","Reddick","Shook","Spangler","Qualls","Cochrane","Root","Connelly"};
    String[] title = {"Mr","Mrs","Ms","mr","mrs","ms"};
    String[] phoneNum = {"9096987401","5160677221","6673613396","6610478961","9317990336","5090268555","3436466303","909733-3863","7430663981","6081125627","5156243751","3479833948","3864065758","9402579489","5711965898","2034885063","8382707370","4304520633","2107374665","3084233896","4435117601","5392906410","4403935050","3154293485","4780378906","4466286012","2175076586","5314747918","3035921586","2813368467"};

    public static void main(String[] args) {
        DummyData dummy = new DummyData();
        dummy.setDummy();
    }
    public void setDummy(){

        Scanner amount = new Scanner(System.in);
        System.out.println("Enter how many objects you would like to randomly create");
        num = amount.nextInt();
        //noinspection InfiniteLoopStatement
        for(int i = 0; i < num; i++) {
                userAge = rand.nextInt((50 - 17) + 1) + 17;
                int id = rand.nextInt((max - min) + 1) + min;
                userID = Integer.toString(id);
                userName = firstName[rand.nextInt(firstName.length)] + " " + surname[rand.nextInt(surname.length)];
                userTitle = title[rand.nextInt(title.length)];
                userPhoneNum = phoneNum[rand.nextInt(phoneNum.length)];
                Passenger pass = new Passenger(userTitle,userName,userID,userPhoneNum,userAge);
                System.out.println(" User Age: " + pass.getPassengerAge() + " User ID: " + pass.getPassengerTitle() + " User Name: " + pass.getPassengerName() + " User Title: " + pass.getPassengerTitle() + " User Phone Number: " + pass.getPassengerPhoneNumber());
                System.out.println("User Created");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                list.add(pass);
        }
    }
}
