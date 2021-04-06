package com.vivek;

import java.util.Date;
import org.hibernate.Session;

import com.vivek.user.DBUser;
import com.vivek.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBUser user = new DBUser();

		user.setUserId(101);
		user.setUsername("Hibernate101");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();



		session.close();
	}
}
