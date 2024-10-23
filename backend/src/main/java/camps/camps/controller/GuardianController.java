package camps.camps.controller;

import camps.camps.model.Guardian;
import camps.camps.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/guardians")
public class GuardianController {

    @Autowired
    private GuardianService guardianService;

    @GetMapping
    public List<Guardian> getAllGuardians() {
        return guardianService.getAllGuardians();
    }

    @GetMapping("/{id}")
    public Optional<Guardian> getGuardianById(@PathVariable Integer id) {
        return guardianService.getGuardianById(id);
    }

    @PostMapping
    public Guardian createGuardian(@RequestBody Guardian guardian) {
        return guardianService.createGuardian(guardian);
    }

    @PutMapping("/{id}")
    public Guardian updateGuardian(@PathVariable Integer id, @RequestBody Guardian guardian) {
        guardian.setGuardianId(id);
        return guardianService.updateGuardian(guardian);
    }

    @DeleteMapping("/{id}")
    public void deleteGuardian(@PathVariable Integer id) {
        guardianService.deleteGuardian(id);
    }
}
