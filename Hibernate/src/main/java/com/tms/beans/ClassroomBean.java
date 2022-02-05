package com.tms.beans;

import javax.persistence.Id;

import lombok.Data;

@Data
public class ClassroomBean {

	@Id
	private int classId;
	private String targetAudience = null;
	private Integer classStrength = null;
	private String course = null;

	private static final ClassroomBean classBeans = new ClassroomBean();
	
	private ClassroomBean() {
		System.out.println("ClassRoom Created");
	}
	
	public static ClassroomBean getClassInstance() {
		return classBeans;
	}

	@Override
	public String toString() {
		return "ClassroomBean [classId=" + classId + ", targetAudience=" + targetAudience + ", classStrength="
				+ classStrength + ", course=" + course + "]";
	}
	
	
}
