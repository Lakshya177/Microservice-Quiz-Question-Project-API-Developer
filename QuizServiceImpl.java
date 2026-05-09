package com.mycompany.service;

import java.util.List;
import java.util.ArrayList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dao.QuizRepository;
import com.mycompany.entity.Quiz;

@Service
public class QuizServiceImpl implements QuizService
{
@Autowired
QuizRepository repo;

@Autowired
QuestionClient questionClient;
	@Override
	public List<Quiz> getAllQuiz() {
		 List<Quiz> quizzes = (List<Quiz>) repo.findAll();
	        List<Quiz> newQuizList = new ArrayList<>();

	        for (Quiz quiz : quizzes) {
	            quiz.setQuestions(questionClient.getQuestionofQuiz(quiz.getQid()));
	            newQuizList.add(quiz);
	        }

	        return newQuizList;
	}

	@Override
	public Quiz getQuizById(Integer qid) {
		Quiz quiz = repo.findById(qid).get();
        quiz.setQuestions(questionClient.getQuestionofQuiz(quiz.getQid()));

        return quiz;
	}

	@Override
	public Quiz postQuiz(Quiz quiz) {
		
		return repo.save(quiz);
	}

	
}
