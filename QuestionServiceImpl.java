package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.entity.Question;
import com.mycompany.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService 
{
	@Autowired
	QuestionRepository repo;

	@Override
	public List<Question> getAllQuestion() {
		List<Question> l= repo.findAll();
		return l;
	}

	@Override
	public Question getQuestionById(Integer qid) {
		Optional<Question> op=repo.findById(qid);
 	   Question q=op.get();
 			return q;
	}

	@Override
	public Question postQuestion(Question q) 
	{
		        return repo.save(q);
	}
	@Override
	public Question putQuestion(Question q) {

		 Question existing = repo.findById(q.getQues_id()).orElse(null);
		    if (existing != null) {
		        existing.setQid(q.getQid());
		        existing.setQuestion(q.getQuestion());
		        return repo.save(existing);
		    }
		    return null;
	}
	@Override
    public Question deleteQuestion(int ques_id) 
    {
        repo.deleteById(ques_id);
		return null;
    }
	
	
	@Override
	public List<Question> getQuestionsofQuizId(Long quiz_id) {
		// TODO Auto-generated method stub
		return repo.findByQid(quiz_id);
	}
}
