package hr.vsite.njp.students.infrastracture.rest;

import hr.vsite.njp.students.domain.StudentDTO;
import hr.vsite.njp.students.domain.StudentsManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentsService.class);

    private final StudentsManager studentsManager;
    private final StudentRestMapper studentRestMapper;

    @Autowired
    public StudentsService(StudentsManager studentsManager, StudentRestMapper studentRestMapper){
        this.studentsManager=studentsManager;
        this.studentRestMapper=studentRestMapper;
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentRestDTO> students(@PathVariable(name = "id") Long id){
        LOGGER.trace("students entry {}", id);
        Optional<StudentDTO> student = studentsManager.findOne(id);
        return ResponseEntity.of(student.map(studentRestMapper::toStudentRest));
    }

    @GetMapping("/students/byname/{name}")
    public ResponseEntity<List<StudentRestDTO>> students(@PathVariable(name = "name") /*@RequestParam(name = "text")*/ String name){
        LOGGER.trace("students entry {}", name);
        List<StudentDTO> studentDTOS = studentsManager.customFindByName(name);
        return ResponseEntity.ok(studentRestMapper.toStudentRest(studentDTOS));
    }

    @GetMapping("/students/")
    public ResponseEntity<List<StudentRestDTO>> proverbs() {

        List<StudentDTO> proverbDTOS = studentsManager.findAll();
        return ResponseEntity.ok(studentRestMapper.toStudentRest(proverbDTOS));
    }
}
