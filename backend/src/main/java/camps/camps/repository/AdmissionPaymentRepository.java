package camps.camps.repository;

import camps.camps.model.AdmissionPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionPaymentRepository extends JpaRepository<AdmissionPayment, Integer> {
}
