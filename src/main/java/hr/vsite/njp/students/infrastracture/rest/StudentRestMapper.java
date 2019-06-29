package hr.vsite.njp.students.infrastracture.rest;

import hr.vsite.njp.students.domain.StudentDTO;
import hr.vsite.njp.students.infrastracture.rest.StudentRestDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentRestMapper {

    StudentRestDTO toStudentRest(StudentDTO student);

    List<StudentRestDTO> toStudentRest(Iterable<StudentDTO> student);
}
