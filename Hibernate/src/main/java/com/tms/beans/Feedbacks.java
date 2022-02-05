package com.tms.beans;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Feedbacks {
	
	@Id
	private int feedbackId;
	private int trainerId;
	
	private String feedbackPersonName;
	private String courseFeedback;
	private String feedback;
	private int points;
	
	private static final Feedbacks feedbacks = new Feedbacks(); 
	
	private Feedbacks() {
		System.out.println("Feedback Created");
	}
	
	public static Feedbacks getFeedsInstance() {
		return feedbacks;
	}

	@Override
	public String toString() {
		return "Feedbacks [feedbackId=" + feedbackId + ", trainerId=" + trainerId + ", feedbackPersonName="
				+ feedbackPersonName + ", courseFeedback=" + courseFeedback + ", feedback=" + feedback + ", points="
				+ points + "]";
	}
	
}
