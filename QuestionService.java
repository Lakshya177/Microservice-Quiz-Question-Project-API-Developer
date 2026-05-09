package com.mycompany.service;

import java.util.List;

import com.mycompany.entity.Question;

public interface QuestionService {
public List<Question> getAllQuestion();
public Question getQuestionById(Integer qid);
public Question postQuestion(Question q);
public Question putQuestion (Question q);
public Question deleteQuestion(int ques_id);
public List<Question> getQuestionsofQuizId(Long quiz_id);
}
