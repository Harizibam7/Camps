package camps.camps.controller;

import camps.camps.model.AdmissionPayment;
import camps.camps.service.AdmissionPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admissionPayments")
public class AdmissionPaymentController {

    @Autowired
    private AdmissionPaymentService admissionPaymentService;

    @GetMapping
    public List<AdmissionPayment> getAllPayments() {
        return admissionPaymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Optional<AdmissionPayment> getPaymentById(@PathVariable Integer id) {
        return admissionPaymentService.getPaymentById(id);
    }

    @PostMapping
    public AdmissionPayment createPayment(@RequestBody AdmissionPayment payment) {
        return admissionPaymentService.createPayment(payment);
    }

    @PutMapping("/{id}")
    public AdmissionPayment updatePayment(@PathVariable Integer id, @RequestBody AdmissionPayment payment) {
        payment.setPaymentId(id);
        return admissionPaymentService.updatePayment(payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Integer id) {
        admissionPaymentService.deletePayment(id);
    }
}
