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
public class AdmissionPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    private String dteRegisterNo;
    private String dtePaymentReceiptNo;
    private String dteAdmissionNo;
    private Date dteReceiptDate;
    private BigDecimal dteReceiptAmount;
    private String dteGeneralRank;
    private Integer entranceMarks;
    private String entranceRankNo;
    private String admissionDiscountName1;
    private BigDecimal admissionDiscountAmount1;
    private String admissionDiscountName2;
    private BigDecimal admissionDiscountAmount2;

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }
}
