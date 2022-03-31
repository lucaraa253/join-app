package com.training.spring;

public class Email {
	private To to;
	private From from;
	private Subject subject;
	private Body body;
	
	public Email(To to, From from, Subject subject, Body body) {
		super();
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}
	
	public Email() {
		
	}

	public To getTo() {
		return to;
	}

	public void setTo(To to) {
		this.to = to;
	}

	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Email [to=" + to + ",\n from=" + from + ",\n subject=" + subject + ",\n body=" + body + "]";
	}
	
	
}
