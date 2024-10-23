package camps.camps.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SchoolTC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schoolTcId;

    private String schoolName;
    private String schoolTcName;
    private String schoolTcNo;
    private Date schoolTcDate;
    private BigDecimal cutOffMarks;
    private String schoolTcClass;
    private String boardOfSchool;
    private Integer schoolYearOfPass;
    private Integer schoolNoOfAttempts;
    private String schoolStudyState;
    private String schoolClassification;

    public void setSchoolTCId(Integer schoolTcId) {
        this.schoolTcId = schoolTcId;
    }

    public Integer getSchoolTCId() {
        return schoolTcId;
    }
}
