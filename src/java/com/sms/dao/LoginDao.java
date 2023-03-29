/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.dao;

import com.sms.model.Login;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author t
 */
public class LoginDao {
    
    public boolean createLogin(Login login) {
        boolean result = false;
        Session session = FactoryManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(login);
        tx.commit();
        session.close();
        result = Boolean.TRUE;
        return result;
    }

    public boolean updateLogin(Login login) {
        boolean result = false;
        Session session = FactoryManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(login);
        tx.commit();
        session.close();
        result = Boolean.TRUE;
        return result;
    }

    public List<Login> findAll() {
        Session session = null;
        List<Login> result = new ArrayList<>();
        try {
            session = FactoryManager.getSessionFactory().openSession();
            result = session.createQuery("from Login").list();
        } catch (HibernateException ex) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;

    }

    public Login findLogin(String email) {
        Session session = null;
        Login result = null;
        try {
            session = FactoryManager.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Login.class);
            criteria.add(Restrictions.eq("email", email));

            result = (Login) criteria.uniqueResult();
        } catch (HibernateException ex) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    public void deleteLogin(Login login) {
        Session session = FactoryManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(login);
        tx.commit();
        session.close();
    }
}
