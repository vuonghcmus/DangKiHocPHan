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
import pojo.course;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class CourseDAO {
    public static List<course> layDanhSachCourse() {
        List<course> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select s from course s";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
    }

    public static course layThongTinCourse(String maMonHoc) {
        course sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = " select sv ";
            hql += "from course sv left join fetch sv.listStudent";
            hql += " where sv.maMonHoc=:maMonHoc";
            Query query = session.createQuery(hql);
            query.setString("maMonHoc", maMonHoc);
            sv = (course) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }
    
    public static course layThongTinCourseTheoTen(String name) {
        course sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = " select sv ";
            hql += "from course sv left join fetch sv.listStudent";
            hql += " where sv.tenMon=:name";
            Query query = session.createQuery(hql);
            query.setString("name", name);
            sv = (course) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }

    public static boolean addCourse(course s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (CourseDAO.layThongTinCourse(s.getMaMonHoc()) != null) {
            return false;
        }
        boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(s);
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

    public static boolean capNhatThongTinCourse(course s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (CourseDAO.layThongTinCourse(s.getMaMonHoc()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(s);
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

    public static boolean xoaCourse(String maMonHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        course s = CourseDAO.layThongTinCourse(maMonHoc);
        if (s == null) {
            return false;
        }
        try {
            String hql = "delete ";
            hql += "from course sv ";
            hql += "where sv.maMonHoc= " + "'" + maMonHoc + "'";
            Query query = session.createQuery(hql);
            query.executeUpdate();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            transaction.commit();
            session.close();
        }
        return true;
    }
}
