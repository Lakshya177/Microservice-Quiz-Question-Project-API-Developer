package com.mycompany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>
{

}
