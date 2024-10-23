package camps.camps.controller;

import camps.camps.model.Hosteller;
import camps.camps.service.HostellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hostellers")
public class HostellerController {

    @Autowired
    private HostellerService hostellerService;

    @GetMapping
    public List<Hosteller> getAllHostellers() {
        return hostellerService.getAllHostellers();
    }

    @GetMapping("/{id}")
    public Optional<Hosteller> getHostellerById(@PathVariable Integer id) {
        return hostellerService.getHostellerById(id);
    }

    @PostMapping
    public Hosteller createHosteller(@RequestBody Hosteller hosteller) {
        return hostellerService.createHosteller(hosteller);
    }

    @PutMapping("/{id}")
    public Hosteller updateHosteller(@PathVariable Integer id, @RequestBody Hosteller hosteller) {
        hosteller.setHostellerId(id);
        return hostellerService.updateHosteller(hosteller);
    }

    @DeleteMapping("/{id}")
    public void deleteHosteller(@PathVariable Integer id) {
        hostellerService.deleteHosteller(id);
    }
}
