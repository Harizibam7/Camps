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
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guardianId;

    private String fatherName;
    private String motherName;
    private String guardianName;
    private String parentOccupation;
    private String placeOfWork;
    private String designation;
    private Double parentIncome;
    private String motherTongue;

    public void setGuardianId(Integer guardianId) {
        this.guardianId = guardianId;
    }

    public Integer getGuardianId() {
        return guardianId;
    }
}
