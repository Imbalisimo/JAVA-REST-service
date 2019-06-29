package hr.vsite.njp.students.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-06-29T15:55:57+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDTO toStudentDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> toStudentDTO(Iterable<Student> student) {
        if ( student == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>();
        for ( Student student1 : student ) {
            list.add( toStudentDTO( student1 ) );
        }

        return list;
    }
}
