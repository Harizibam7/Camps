package camps.camps.service;

import camps.camps.model.StudentDetails;
import camps.camps.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentDetailsService {
    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    public List<StudentDetails> getAllStudents() {
        return studentDetailsRepository.findAll();
    }

    public Optional<StudentDetails> getStudentById(Integer id) {
        return studentDetailsRepository.findById(id);
    }

    public StudentDetails createStudent(StudentDetails studentDetails) {
        return studentDetailsRepository.save(studentDetails);
    }

    public void deleteStudent(Integer id) {
        studentDetailsRepository.deleteById(id);
    }

    public StudentDetails updateStudent(StudentDetails studentDetails) {
        return studentDetailsRepository.save(studentDetails);
    }
}
