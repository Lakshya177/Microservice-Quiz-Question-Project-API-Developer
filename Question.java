package com.mycompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer ques_id;
Integer qid;
String question;
public Integer getQues_id() {
	return ques_id;
}
public void setQues_id(Integer ques_id) {
	this.ques_id = ques_id;
}
public Integer getQid() {
	return qid;
}
public void setQid(Integer qid) {
	this.qid = qid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
}
