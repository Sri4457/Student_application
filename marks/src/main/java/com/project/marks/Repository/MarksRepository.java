package com.project.marks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.marks.Model.Marks;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Long>{

	Marks findByStdid(String stdid);

}
