package com.mycompany.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mycompany.entity.Question;

@FeignClient(url="http://localhost:8082" ,value="Question-client")
public interface QuestionClient {

	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionofQuiz(@PathVariable Integer quizId);
	
}
