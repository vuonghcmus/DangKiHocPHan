/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pojo.user;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class UserDAO {

    public static List<user> layDanhSachUser() {
        List<user> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select u from user u";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static boolean addUser(user u) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(u);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }

    public static user layThongTinUser(String username) {
        user u = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            u = (user) session.get(user.class, username);
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return u;
    }

    public static boolean capNhatThongTinUser(user u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (UserDAO.layThongTinUser(u.getUsername()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(u);
            transaction.commit();
        } catch (HibernateException ex) {
//Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }

    public static boolean xoaUser(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        user u = UserDAO.layThongTinUser(username);
        if (u == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(u);
            transaction.commit();
        } catch (HibernateException ex) {
//Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
