package com.mycompany.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Quiz {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer qid;
String title;
transient private List<Question> questions;
public List<Question> getQuestions() {
	return questions;
}
public void setQuestions(List<Question> questions) {
	this.questions = questions;
}
public Integer getQid() {
	return qid;
}
public void setQid(Integer qid) {
	this.qid = qid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
}

