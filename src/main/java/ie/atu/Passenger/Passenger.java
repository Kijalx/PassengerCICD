/*
 * Aleksander Kijewski
 * G00396018
 * Java Personal Assignment // Test Driven File
 */
package ie.atu.Passenger;
//
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Passenger {
    /* Creates local variables*/
    private String userTitle;
    private String userName;
    private String userID;
    private String userPhoneNum;
    private int userAge;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;

    public Passenger(String title, String name, String id, String phoneNum, int age){
    }


}
