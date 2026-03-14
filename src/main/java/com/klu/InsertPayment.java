package com.klu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class InsertPayment {

    public static void main(String[] args) {

        SessionFactory factory =
        new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        Payment p = new Payment(1,"Teja","Success",new Date());

        session.save(p);

        session.getTransaction().commit();

        session.close();
        factory.close();

        System.out.println("Payment Inserted");
    }
}