/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import java.util.Date;
//import java.sql.Date;
import pojo.semester;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class semesterDAO {

    public static List<semester> layDanhSachSemester() {
        List<semester> listSemester = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select u from semester u";
            Query query = session.createQuery(hql);
            listSemester = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listSemester;
    }

    public static semester layThongTinSemester(String ngayBatDau) {
        semester t = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            t = (semester) session.get(semester.class, ngayBatDau);
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return t;
    }
    
     public static semester layThongTinSemesterHocKiHT() {
        List<semester> listSemester = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
//            String hql = "select u from semester u where u.name = " + name + " and u.year = " + year;
            String hql = "FROM semester AS u where u.hocKyHienTai = " + "'" + 1 + "'";
            Query query = session.createQuery(hql);
            listSemester = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (listSemester.size() == 0) {
            return null;
        } else {
            return listSemester.get(0);
        }
    }

    public static semester layHocKyVaNamCuaSemester(String name, String year) {
        List<semester> listSemester = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
//            String hql = "select u from semester u where u.name = " + name + " and u.year = " + year;
            String hql = "FROM semester AS u where u.name = " + "'" + name + "'" + " and u.year = " + "'" + year + "'";
            Query query = session.createQuery(hql);
            listSemester = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (listSemester.size() == 0) {
            return null;
        } else {
            return listSemester.get(0);
        }
    }

    public static boolean addSemester(semester t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (semesterDAO.layThongTinSemester(t.getNgayBatDau()) != null) {
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

    public static boolean capNhatThongTinSemester(semester t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (semesterDAO.layThongTinSemester(t.getNgayBatDau()) == null
                || semesterDAO.layHocKyVaNamCuaSemester(t.getName(), t.getYear()) == null) {
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

    public static boolean xoaSemeter(String ngayBatDau) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        semester t = semesterDAO.layThongTinSemester(ngayBatDau);
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

    public static boolean xoaSemeter(String name, String year) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        semester t = semesterDAO.layHocKyVaNamCuaSemester(name, year);
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
