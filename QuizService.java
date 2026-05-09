package com.mycompany.service;

import java.util.List;

import com.mycompany.entity.Quiz;

public interface QuizService {
public List<Quiz> getAllQuiz();
public Quiz getQuizById(Integer qid);
public Quiz postQuiz(Quiz quiz);
}
