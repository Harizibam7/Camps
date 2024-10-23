package camps.camps.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String name;
    private String email;
    private String enrollmentNo;
    private String registerNo;
    private String applicationNo;
    private String dteRegNo;
    private String admissionNo;
    private Date dateOfAdmission;
    private String gender;
    private Date dateOfBirth;
    private Integer age;
    private String community;
    private String religion;
    private String bloodGroup;
    private String nationality;
    private String aadharNo;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "guardian_id")
    private Guardian guardian;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "hosteller_id")
    private Hosteller hosteller;

    @ManyToOne
    @JoinColumn(name = "school_tc_id")
    private SchoolTC schoolTc;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private AdmissionPayment admissionPayment;

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
