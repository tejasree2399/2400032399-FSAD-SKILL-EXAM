package com.klu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeletePayment {

    public static void main(String[] args) {

        SessionFactory factory =
        new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        Payment p = session.get(Payment.class,1);

        if(p!=null)
        {
            session.delete(p);
            System.out.println("Payment Deleted");
        }

        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}