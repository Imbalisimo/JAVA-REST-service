package hr.vsite.njp.students.domain;

import java.util.List;

public interface CustomStudentsRepository {
    List<Student> customFindByName(String value);
}
