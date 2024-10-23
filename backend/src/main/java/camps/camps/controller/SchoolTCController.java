package camps.camps.controller;

import camps.camps.model.SchoolTC;
import camps.camps.service.SchoolTCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schoolTCs")
public class SchoolTCController {

    @Autowired
    private SchoolTCService schoolTCService;

    @GetMapping
    public List<SchoolTC> getAllSchoolTCs() {
        return schoolTCService.getAllSchoolTCs();
    }

    @GetMapping("/{id}")
    public Optional<SchoolTC> getSchoolTCById(@PathVariable Integer id) {
        return schoolTCService.getSchoolTCById(id);
    }

    @PostMapping
    public SchoolTC createSchoolTC(@RequestBody SchoolTC schoolTC) {
        return schoolTCService.createSchoolTC(schoolTC);
    }

    @PutMapping("/{id}")
    public SchoolTC updateSchoolTC(@PathVariable Integer id, @RequestBody SchoolTC schoolTC) {
        schoolTC.setSchoolTCId(id);
        return schoolTCService.updateSchoolTC(schoolTC);
    }

    @DeleteMapping("/{id}")
    public void deleteSchoolTC(@PathVariable Integer id) {
        schoolTCService.deleteSchoolTC(id);
    }
}
