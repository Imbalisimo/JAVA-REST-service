package hr.vsite.njp.students.domain;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO toStudentDTO(Student student);
    List<StudentDTO> toStudentDTO(Iterable<Student> student);
}
