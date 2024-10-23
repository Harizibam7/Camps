package camps.camps.service;

import camps.camps.model.SchoolTC;
import camps.camps.repository.SchoolTCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolTCService {
    @Autowired
    private SchoolTCRepository schoolTCRepository;

    public List<SchoolTC> getAllSchoolTCs() {
        return schoolTCRepository.findAll();
    }

    public Optional<SchoolTC> getSchoolTCById(Integer id) {
        return schoolTCRepository.findById(id);
    }

    public SchoolTC createSchoolTC(SchoolTC schoolTC) {
        return schoolTCRepository.save(schoolTC);
    }

    public void deleteSchoolTC(Integer id) {
        schoolTCRepository.deleteById(id);
    }

    public SchoolTC updateSchoolTC(SchoolTC schoolTC) {
        return schoolTCRepository.save(schoolTC);
    }
}
