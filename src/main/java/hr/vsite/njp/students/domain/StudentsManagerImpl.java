package hr.vsite.njp.students.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class StudentsManagerImpl implements StudentsManager{

    private final StudentsRepository repository;
    private final StudentMapper mapper;

    @Autowired
    public StudentsManagerImpl(StudentsRepository repository, StudentMapper mapper){
        this.repository=repository;
        this.mapper=mapper;
    }

    @Override
    public List<StudentDTO> findAll() {
        return mapper.toStudentDTO(repository.findAll());
    }

    @Override
    @Transactional
    public Optional<StudentDTO> findOne(Long id) {

        Optional<Student> studentOptional = repository.findById(id);
        Student student = studentOptional.get();
        return Optional.ofNullable(mapper.toStudentDTO(student));
    }

    @Override
    public StudentDTO random() {
        return null;
    }

    @Override
    public void create(String name) {

    }
}
