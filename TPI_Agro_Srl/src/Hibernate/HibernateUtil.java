package Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
    private static Session session;

    public static Session getSession() {
        if (sessionFactory == null){
            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            try {
                sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(registry);
            }
            catch (HibernateException e) {
                System.out.println("Error al crear factory: " + e.getMessage());
                StandardServiceRegistryBuilder.destroy( registry );
            }
            session = sessionFactory.openSession();
        }
        if (session == null || !session.isOpen())
            session = sessionFactory.openSession();

        return session;
    }
}
