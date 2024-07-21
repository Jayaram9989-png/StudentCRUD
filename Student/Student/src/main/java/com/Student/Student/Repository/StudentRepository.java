package com.Student.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.Student.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
