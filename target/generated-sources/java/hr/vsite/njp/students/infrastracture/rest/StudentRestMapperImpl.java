package hr.vsite.njp.students.infrastracture.rest;

import hr.vsite.njp.students.domain.StudentDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-06-29T15:55:58+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"
)
@Component
public class StudentRestMapperImpl implements StudentRestMapper {

    @Override
    public StudentRestDTO toStudentRest(StudentDTO student) {
        if ( student == null ) {
            return null;
        }

        StudentRestDTO studentRestDTO = new StudentRestDTO();

        studentRestDTO.setId( student.getId() );
        studentRestDTO.setName( student.getName() );

        return studentRestDTO;
    }

    @Override
    public List<StudentRestDTO> toStudentRest(Iterable<StudentDTO> student) {
        if ( student == null ) {
            return null;
        }

        List<StudentRestDTO> list = new ArrayList<StudentRestDTO>();
        for ( StudentDTO studentDTO : student ) {
            list.add( toStudentRest( studentDTO ) );
        }

        return list;
    }
}
