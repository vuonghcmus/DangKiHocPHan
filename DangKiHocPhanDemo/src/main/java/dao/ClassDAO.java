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
import pojo.Class;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class ClassDAO {

    public static List<Class> layDanhSachClass() {
        List<Class> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select u from class u";
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

    public static boolean addClass(Class u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (ClassDAO.layThongTinClass(u.getMaLop()) != null) {
            return false;
        }
        boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(u);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            kq = false;
        } finally {
            session.close();
        }
        return kq;
    }

    public static Class layThongTinClass(String maLop) {
        Class sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = " select c ";
            hql += "from class c left join fetch c.studentsList";
            hql += " where c.maLop=:maLop";
            Query query = session.createQuery(hql);
            query.setString("maLop", maLop);
            sv = (Class) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }

    public static boolean capNhatThongTinClass(Class u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (ClassDAO.layThongTinClass(u.getMaLop()) == null) {
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

    public static boolean xoaClass(String maLop) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Class u = ClassDAO.layThongTinClass(maLop);
        if (u == null) {
            return false;
        }
        try {
            String hql = "delete ";
            hql += "from class sv ";
            hql += "where sv.maLop= " + "'" + maLop + "'";
            Query query = session.createQuery(hql);
            query.executeUpdate();
//            sv = (student) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            transaction.commit();
            session.close();
        }
        return true;
    }
}
