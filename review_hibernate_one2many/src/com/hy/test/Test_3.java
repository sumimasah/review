package com.hy.test;

import com.hy.model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by sumimasah on 2017/7/22.
 */
public class Test_3 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        Students student = (Students) session.get(Students.class,2);

        student.setSex("s");

        session.update(student);

        session.getTransaction().commit();

        sessionFactory.close();
    }
}
