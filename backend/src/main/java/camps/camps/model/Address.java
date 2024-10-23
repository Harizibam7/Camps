package camps.camps.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    private String permanentAddress;
    private String presentAddress;
    private String locationOfResidence;
    private String parentMobileNo;
    private String studentEmailId;
    private String parentEmailId;
    private String officialEmailId;

    public void setAddressId(Integer id) {
        this.addressId = id;
    }
}
