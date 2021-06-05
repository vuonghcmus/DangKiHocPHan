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
import pojo.subject;

/**
 *
 * @author HP
 */
public class SubjectDAO {

    public static List<subject> layDanhSachSubject() {
        List<subject> listSubject = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select s from subject s";
            Query query = session.createQuery(hql);
            listSubject = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listSubject;
    }

    public static subject layThongTinSubject(String maMonHoc) {
        subject sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = " select sv ";
            hql += "from subject sv left join fetch sv.studentsList";
            hql += " where sv.maMonHoc=:maMonHoc";
            Query query = session.createQuery(hql);
            query.setString("maMonHoc", maMonHoc);
            sv = (subject) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }

    public static subject layThongTinSubjectTheoTen(String name) {
        subject sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = " select sv ";
            hql += "from subject sv left join fetch sv.studentsList";
            hql += " where sv.name=:name";
            Query query = session.createQuery(hql);
            query.setString("name", name);
            sv = (subject) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }
    
    public static boolean addSubject(subject s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SubjectDAO.layThongTinSubject(s.getMaMonHoc()) != null) {
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

    public static boolean capNhatThongTinSubject(subject s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SubjectDAO.layThongTinSubject(s.getMaMonHoc()) == null) {
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

    public static boolean xoaSubject(String maMonHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        subject s = SubjectDAO.layThongTinSubject(maMonHoc);
        if (s == null) {
            return false;
        }
        try {
            String hql = "delete ";
            hql += "from subject sv ";
            hql += "where sv.maMonHoc= " + "'" + maMonHoc + "'";
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
