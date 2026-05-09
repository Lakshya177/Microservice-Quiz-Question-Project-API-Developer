package com.mycompany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.Quiz;
import com.mycompany.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class MyController {
@Autowired
	QuizService service;
	
@GetMapping
public List<Quiz> getAllQuiz() {
		List<Quiz> l=service.getAllQuiz();
		return l;
	}

	@GetMapping("/{qid}")
	public Quiz getQuizById(@PathVariable Integer qid) {
		Quiz q=service.getQuizById(qid);
		
		return q;
	}

	@PostMapping
	public Quiz postQuiz(@RequestBody Quiz quiz) {
		System.out.println("controller="+quiz);
		return service.postQuiz(quiz);
	}

}

