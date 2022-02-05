package com.tms.beans;

import java.util.List;

import javax.persistence.Id;

import lombok.Data;

/**
 * @author Satyaa
 * @see Trainer beans class
 * @since February, 2022
 */
@Data
public class Trainer {

	@Id
	private int trainerId;
	private String trainerEmail;
	private String trainerName;
	private String trainerPassword;
	private int phoneNo;
	private String trainerDOB = null;
	private String trainerAdd = null;
	private String trainerSocials = null;
	private String currentStatus = null;

	private List<TOCBeans> toc;
	
	private int tocId;

	private static final Trainer trainer = new Trainer();

	public static Trainer getTrainerInstance() {
		return trainer;
	}

	private Trainer() {
		System.out.println("Trainer Created!");
	}

	public Trainer(Trainer trainer) {
		System.out.println("Trainer Duplicate Created!");
	}

	// SignUP builder ....
	public Trainer setTrainerEmail(String email) {
		this.trainerEmail = email;
		return this;
	}

	public Trainer setTrainerPassword(String password) {
		this.trainerPassword = password;
		return this;
	}

	public Trainer setTrainerName(String name) {
		this.trainerName = name;
		return this;
	}

	public Trainer build() {
		return trainer;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerEmail=" + trainerEmail + ", trainerName=" + trainerName
				+ ", trainerPassword=" + trainerPassword + ", phoneNo=" + phoneNo + ", trainerDOB=" + trainerDOB
				+ ", trainerAdd=" + trainerAdd + ", trainerSocials=" + trainerSocials + ", tocId=" + tocId + "]";
	}

}
