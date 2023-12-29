package com.project.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.student.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	Student findByStudentid(String studentid);

}
