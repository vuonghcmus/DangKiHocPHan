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
import pojo.teacher;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class TeacherDAO {

    public static List<teacher> layDanhSachTeacher() {
        List<teacher> listTeacher = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select u from teacher u";
            Query query = session.createQuery(hql);
            listTeacher = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listTeacher;
    }

    public static teacher layThongTinTeacher(String username) {
        teacher t = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            t = (teacher) session.get(teacher.class, username);
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return t;
    }

    public static boolean addTeacher(teacher t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (TeacherDAO.layThongTinTeacher(t.getUsername()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(t);
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

    public static boolean capNhatThongTinTeacher(teacher t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (TeacherDAO.layThongTinTeacher(t.getUsername()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(t);
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

    public static boolean xoaTeacher(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        teacher t = TeacherDAO.layThongTinTeacher(username);
        if (t == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(t);
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
