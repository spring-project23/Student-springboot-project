package com.example.studentproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
