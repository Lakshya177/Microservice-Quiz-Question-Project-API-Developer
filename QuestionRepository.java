package com.mycompany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> 
{
	public List<Question> findByQid(Long id);
}
