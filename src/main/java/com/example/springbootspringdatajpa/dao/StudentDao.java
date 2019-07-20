package com.example.springbootspringdatajpa.dao;

import com.example.springbootspringdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student, Long> {

    List<Student> findByName(String name);

}
