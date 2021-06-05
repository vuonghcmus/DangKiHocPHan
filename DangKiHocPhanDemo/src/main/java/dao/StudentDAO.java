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
import pojo.student;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class StudentDAO {

    public static student layThongTinSinhVien(String id) {
        student sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = " select sv ";
            hql += "from student sv left join fetch sv.class_student";
            hql += " where sv.id=:id";
            Query query = session.createQuery(hql);
            query.setString("id", id);
            sv = (student) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }

    public static student layThongTinSinhVien_1(String maSinhVien) {
        student sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            sv = (student) session.get(student.class, maSinhVien);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }

    public static boolean themSinhVien(student sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (StudentDAO.layThongTinSinhVien(sv.getId()) != null) {
            return false;
        }
        boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(sv);
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

    public static List<student> layDanhSachStudent() {
        List<student> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select u from student u";
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

    public static List<student> layDanhSachStudentTheoMaLop(String maLop) {
        List<student> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select u from student u where u.maLop =:maLop";
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

    public static boolean capNhatThongTinStudent(student u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (StudentDAO.layThongTinSinhVien(u.getId()) == null) {
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

    public static boolean xoaStudent(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        student u = StudentDAO.layThongTinSinhVien(id);
        if (u == null) {
            return false;
        }
        try {
            String hql = "delete ";
            hql += "from student sv ";
            hql += "where sv.id= " + "'" + id + "'";
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
