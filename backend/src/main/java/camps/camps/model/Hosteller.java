package camps.camps.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hosteller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hostellerId;

    private String hostelName;
    private String hostelRoomNo;
    private Integer hostelRoomCapacity;
    private Integer hostelFloorNo;
    private String wardenName;
    private String classAdvisor;
    private Date hDiscontinuedDate;

    @Lob
    private String hNote;

    public void setHostellerId(Integer hostellerId) {
        this.hostellerId = hostellerId;
    }

    public Integer getHostellerId() {
        return hostellerId;
    }
}
