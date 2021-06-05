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
import pojo.account;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class AccountDAO {

    public static List<account> layDanhSachSinhVien() {
        List<account> ds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select ac from account ac";
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

    public static boolean addAccount(account ac) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(ac);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
