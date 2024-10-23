package camps.camps.service;

import camps.camps.model.AdmissionPayment;
import camps.camps.repository.AdmissionPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdmissionPaymentService {
    @Autowired
    private AdmissionPaymentRepository admissionPaymentRepository;

    public List<AdmissionPayment> getAllPayments() {
        return admissionPaymentRepository.findAll();
    }

    public Optional<AdmissionPayment> getPaymentById(Integer id) {
        return admissionPaymentRepository.findById(id);
    }

    public AdmissionPayment createPayment(AdmissionPayment admissionPayment) {
        return admissionPaymentRepository.save(admissionPayment);
    }

    public void deletePayment(Integer id) {
        admissionPaymentRepository.deleteById(id);
    }

    public AdmissionPayment updatePayment(AdmissionPayment admissionPayment) {
        return admissionPaymentRepository.save(admissionPayment);
    }
}
