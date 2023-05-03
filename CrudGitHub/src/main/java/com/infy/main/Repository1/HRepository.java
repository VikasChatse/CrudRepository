package com.infy.main.Repository1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.main.Model.Student;
@Repository
public interface HRepository extends JpaRepository<Student, Integer> {

}
