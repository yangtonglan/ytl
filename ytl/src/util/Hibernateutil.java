package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernateutil {

	public static SessionFactory factory = null;
	public static Session session= null;
	
	//加载配置文件
	static{
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		factory = new MetadataSources(registry).buildMetadata().buildSessionFactory(); 
	}
	
	public static Session getSession() {
		session = factory.openSession();
		return session;
	}
	
	public static void close() {
		if (session != null) {
			session.close();
		}
	}


}
