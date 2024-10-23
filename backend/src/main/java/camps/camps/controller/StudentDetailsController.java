package camps.camps.controller;

import camps.camps.model.StudentDetails;
import camps.camps.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentDetails")
public class StudentDetailsController {

    @Autowired
    private StudentDetailsService studentDetailsService;

    @GetMapping
    public List<StudentDetails> getAllStudents() {
        return studentDetailsService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<StudentDetails> getStudentById(@PathVariable Integer id) {
        return studentDetailsService.getStudentById(id);
    }

    @PostMapping
    public StudentDetails createStudent(@RequestBody StudentDetails student) {
        return studentDetailsService.createStudent(student);
    }

    @PutMapping("/{id}")
    public StudentDetails updateStudent(@PathVariable Integer id, @RequestBody StudentDetails student) {
        student.setStudentId(id);
        return studentDetailsService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentDetailsService.deleteStudent(id);
    }
}
