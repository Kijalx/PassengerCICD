/*package ie.atu.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class DummyData {
    Passenger newpass = new Passenger();
    Random rand = new Random();
    String userName, userTitle, userPhoneNum, userID;
    int userAge;
    private int num;
    int max = 1999999999;
    int min = 1000000000;
    String[] firstName = {"Richard","Mikaela","Caitlyn","Syed","Dani","Ismail","Felicity","Brayleigh","Karmen","Felix","Amberly","Alexavier","Mavis","Renata","Camron","Leyla","Saydee","Dashiell","Jamison","Demi","Drake","Cian","Maddison","Sawyer","Amina","Valerie","Ivey","Madilynn","Candace","Osman","John","Nolan","Valeria","Alexa","Anakin","Kaleb","Maite","Moira","Bradlee","Ryleigh"};
    String[] surname = {"Landers","Darby","Horton","Dawson","Devries","Dupree","Langley","Lauer","Buffington","Wall","Guevara","Milam","Pollock","George","Riley","Ambrose","McClanahan","McCormick","Early","Mercado","Carver","Hager","Rockwell","Bradford","Shannon","Broyles","Beaver","Zielinski","Navarro","Kilpatrick","Caron","Bean","Cuevas","Reddick","Shook","Spangler","Qualls","Cochrane","Root","Connelly"};
    String[] title = {"Mr","Mrs","Ms","mr","mrs","ms"};
    String[] phoneNum = {"9096987401","5160677221","6673613396","6610478961","9317990336","5090268555","3436466303","90973303863","7430663981","6081125627","5156243751","3479833948","3864065758","9402579489","5711965898","2034885063","8382707370","4304520633","2107374665","3084233896","4435117601","5392906410","4403935050","3154293485","4780378906","4466286012","2175076586","5314747918","3035921586","2813368467"};

    public int setDummyAge(){
        userAge = rand.nextInt((50 - 17) + 1) + 17;
        newpass.setAge(userAge);
        return newpass.getPassengerAge();
    }

    public String setDummyID(){
        int id = rand.nextInt((max - min) + 1) + min;
        userID = Integer.toString(id);
        newpass.setID(userID);
        return newpass.getPassengerUserID();
    }
    public String setDummyName(){
        userName = firstName[rand.nextInt(firstName.length)] + " " + surname[rand.nextInt(surname.length)];
        newpass.setName(userName);
        return newpass.getPassengerName();
    }
    public String setDummyTitle(){
        userTitle = title[rand.nextInt(title.length)];
        newpass.setTitle(userTitle);
        return newpass.getPassengerTitle();
    }
    public String setDummyPhoneNum(){
        userPhoneNum = phoneNum[rand.nextInt(phoneNum.length)];
        newpass.setPhoneNumber(userPhoneNum);
        return newpass.getPassengerPhoneNumber();
    }
}
*/