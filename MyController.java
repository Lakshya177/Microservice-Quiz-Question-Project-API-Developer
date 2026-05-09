package com.mycompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.Question;
import com.mycompany.service.QuestionService;

@RestController
@RequestMapping("/question")
public class MyController {
@Autowired
QuestionService service;

@GetMapping
public List<Question> getAllQuestion()
{
	List<Question> l=service.getAllQuestion();
	return l;
}

@GetMapping("/{qid}")
public Question getQuizById(@PathVariable Integer qid)
{
Question q=service.getQuestionById(qid);
		return q;
}

@PostMapping
public Question postQuestion(@RequestBody Question quiz)
{
	System.out.println("controller="+quiz);
	return service.postQuestion(quiz);
}
@PutMapping
public Question putQuestion(@RequestBody Question q) {
    return service.putQuestion(q);
}

@DeleteMapping("/{ques_id}")
public String deleteQuestion(@PathVariable int ques_id) {
    service.deleteQuestion(ques_id);
    return "Delete successfully";
}

@GetMapping("/quiz/{quiz_id}")
public List<Question> getQuestionsofQuizId(@PathVariable Long quiz_id){
	return service.getQuestionsofQuizId(quiz_id);
}

}
