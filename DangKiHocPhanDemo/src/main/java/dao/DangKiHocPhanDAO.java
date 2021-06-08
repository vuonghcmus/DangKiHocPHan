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
import pojo.dangKiHocPhan;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class DangKiHocPhanDAO {

    public static List<dangKiHocPhan> layDanhSachDangKiHP() {
        List<dangKiHocPhan> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select u from dangkihocphan u";
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

    public static dangKiHocPhan layThongTinDangKiHP(int id) {
        dangKiHocPhan t = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            t = (dangKiHocPhan) session.get(dangKiHocPhan.class, id);
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return t;
    }
    
    public static dangKiHocPhan layThongTinDangKiHPHT() {
        List<dangKiHocPhan> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "FROM dangkihocphan AS u where u.hkHienTai = " + "'" + 1 + "'";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }
    
    public static List<dangKiHocPhan> layThongTinDKHPTheoTen(String name) {
        List<dangKiHocPhan> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "FROM dangkihocphan AS u where u.name = " + "'" + name + "'";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (list.size() == 0)
            return null;
        return list;
    }

    public static boolean addDangKiHP(dangKiHocPhan t) {
        Session session = HibernateUtil.getSessionFactory().openSession();

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

    public static boolean capNhatThongTinDangKiHP(dangKiHocPhan t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (DangKiHocPhanDAO.layThongTinDangKiHP(t.getId()) == null) {
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

    public static boolean xoaDangKiHP(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        dangKiHocPhan t = DangKiHocPhanDAO.layThongTinDangKiHP(id);
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
