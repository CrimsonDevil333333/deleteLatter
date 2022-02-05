package com.tms;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.tms.beans.Employee;
import com.tms.beans.Trainer;

public class HibernateUtility {
	private HibernateUtility() {
		System.out.println("Hibernate Called");
	}

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		configuration.addAnnotatedClass(Trainer.class);
		configuration.addAnnotatedClass(Employee.class);
		// TOC

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);
	}
}
