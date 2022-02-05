package com.tms.beans;

import javax.persistence.Id;

import lombok.Data;

@Data
public class TOCBeans {
	
	@Id
	private int tocId;
	
	private static final TOCBeans toc = new TOCBeans();
	
	private TOCBeans() {
		System.out.println("TOC created");
	}
	
	public static TOCBeans getTocInstance() {
		return toc;
	}
	
}
