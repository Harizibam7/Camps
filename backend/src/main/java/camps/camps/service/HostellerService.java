package camps.camps.service;

import camps.camps.model.Hosteller;
import camps.camps.repository.HostellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HostellerService {
    @Autowired
    private HostellerRepository hostellerRepository;

    public List<Hosteller> getAllHostellers() {
        return hostellerRepository.findAll();
    }

    public Optional<Hosteller> getHostellerById(Integer id) {
        return hostellerRepository.findById(id);
    }

    public Hosteller createHosteller(Hosteller hosteller) {
        return hostellerRepository.save(hosteller);
    }

    public void deleteHosteller(Integer id) {
        hostellerRepository.deleteById(id);
    }

    public Hosteller updateHosteller(Hosteller hosteller) {
        return hostellerRepository.save(hosteller);
    }
}
