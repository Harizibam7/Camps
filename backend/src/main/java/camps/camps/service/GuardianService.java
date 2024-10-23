package camps.camps.service;

import camps.camps.model.Guardian;
import camps.camps.repository.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuardianService {
    @Autowired
    private GuardianRepository guardianRepository;

    public List<Guardian> getAllGuardians() {
        return guardianRepository.findAll();
    }

    public Optional<Guardian> getGuardianById(Integer id) {
        return guardianRepository.findById(id);
    }

    public Guardian createGuardian(Guardian guardian) {
        return guardianRepository.save(guardian);
    }

    public void deleteGuardian(Integer id) {
        guardianRepository.deleteById(id);
    }

    public Guardian updateGuardian(Guardian guardian) {
        return guardianRepository.save(guardian);
    }
}
