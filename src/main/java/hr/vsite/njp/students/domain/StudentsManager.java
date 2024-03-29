package hr.vsite.njp.students.domain;

import java.util.List;
import java.util.Optional;

public interface StudentsManager {

    List<StudentDTO> findAll();

    Optional<StudentDTO> findOne(Long id);

    StudentDTO random();

    List<StudentDTO> customFindByName(String value);

    void create(String name);
}
