package hr.vsite.njp.students.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Long> , CustomStudentsRepository {
}
