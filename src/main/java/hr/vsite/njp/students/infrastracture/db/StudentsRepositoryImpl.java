package hr.vsite.njp.students.infrastracture.db;

import com.querydsl.jpa.impl.JPAQuery;
import hr.vsite.njp.students.domain.CustomStudentsRepository;
import hr.vsite.njp.students.domain.QStudent;
import hr.vsite.njp.students.domain.Student;
import hr.vsite.njp.students.domain.StudentsRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class StudentsRepositoryImpl implements CustomStudentsRepository {

    private final EntityManager manager;

    private final JdbcTemplate jdbcTemplate;

    public StudentsRepositoryImpl(EntityManager manager, JdbcTemplate jdbcTemplate) {
        this.manager = manager;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> customFindByName(String value) {
        JPAQuery<Student> queryJpa = new JPAQuery<>(manager);
        return queryJpa.from(QStudent.student)
                .where(QStudent.student.name.contains(value)).fetch();
    }
}
