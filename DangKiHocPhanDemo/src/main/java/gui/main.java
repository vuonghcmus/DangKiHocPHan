/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.AccountDAO;
import dao.ClassDAO;
import dao.CourseDAO;
import dao.DangKiHocPhanDAO;
import dao.StudentDAO;
import dao.SubjectDAO;
import dao.TeacherDAO;
import dao.UserDAO;
import dao.semesterDAO;
import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import pojo.account;
import pojo.semester;
import pojo.student;
import pojo.teacher;
import pojo.user;
import pojo.Class;
import pojo.dangKiHocPhan;
import pojo.subject;
import pojo.course;

/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {


//        student sv = StudentDAO.layThongTinSinhVien("19120728");
//        Class a = new Class();
//        a.setMaLop("19CTT4");
//        Class b = new Class();
//        b.setMaLop("19CTT2");
//        Class c = new Class();
//        c.setMaLop("19CTT3");
//        Class d = new Class();
//        d.setMaLop("19CTT1");
//        Class e = new Class();
//        e.setMaLop("19CM1");
//        Class f = new Class();
//        f.setMaLop("19CTT5");
//        Class g = new Class();
//        g.setMaLop("20CTT4");
//        Class h = new Class();
//        h.setMaLop("19HO1");
//        Class k = new Class();
//        k.setMaLop("19SH1");
//
//        sv.getClass_student().add(a);
//        sv.getClass_student().add(d);
//
//        StudentDAO.capNhatThongTinStudent(sv);
//
//        student sv1 = StudentDAO.layThongTinSinhVien("19120725");
//        sv1.getClass_student().add(b);
//        sv1.getClass_student().add(c);
//        StudentDAO.capNhatThongTinStudent(sv1);
//        student st = StudentDAO.layThongTinSinhVien("19120728");
//        subject sb = SubjectDAO.layThongTinSubject("BAA000103");
//        subject sb2 = SubjectDAO.layThongTinSubject("CSC13102");
//        
//        st.getListSubjects().add(sb);
//        st.getListSubjects().add(sb2);
//        StudentDAO.capNhatThongTinStudent(st);
//        student sv1 = StudentDAO.layThongTinSinhVien("19120725");
//        subject sb2 = SubjectDAO.layThongTinSubject("ENV00002");
//        System.out.println(sb2.getName() + " - " + sb2.getMaMonHoc() + " - " + sb2.getSoTinChi());
//        sv1.getListSubjects().add(sb2);
//        StudentDAO.capNhatThongTinStudent(sv1);
//        student sv2 = StudentDAO.layThongTinSinhVien("19120728");
//        List<subject> s = new ArrayList<>(sv2.getListSubjects());
//        System.out.println(s.size());
//        for (subject a : s) {
//            System.out.println(a.getName() + " - " + a.getSoTinChi());
//        }
//        subject sb3 = SubjectDAO.layThongTinSubject("BIO00001");
//        System.out.println(sb3.getName() + " - " + sb3.getMaMonHoc() + " - " + sb3.getSoTinChi());
//        List<Class> listClass = ClassDAO.layDanhSachClass();
//        
//        for (Class c : listClass) {
//            System.out.println(c.getMaLop());
//        }
//        List<subject> listSubject = SubjectDAO.layDanhSachSubject();
//        
//        for (subject object : listSubject) {
//            System.out.println(object.getName());
//        }
//        semester s = semesterDAO.layThongTinSemesterHocKiHT();
//        System.out.println(s.getName() + " - " + s.getNgayBatDau() + " - " + s.getNgayKetThuc());
//        dangKiHocPhan dk = new dangKiHocPhan();
//        dk.setName("HK5 - 2021");
//        dk.setNgayBatDau("01-07-2021");
//        dk.setNgayKetThuc("01-08-2021");
//        dk.setId(0);
//        if (DangKiHocPhanDAO.addDangKiHP(dk) == true) {
//            System.out.println("Thanh cong");
//        }else{
//            System.out.println("That bai");
//        }
//        dangKiHocPhan dk = DangKiHocPhanDAO.layThongTinDangKiHPHT();
//        System.out.println(dk.getId() + " - " + dk.getName() + " - " + dk.getId());
//        subject s = SubjectDAO.layThongTinSubjectTheoTen("Thể dục 2");
//        student st = new student();
//        st.setAddress("Ha Noi");
//        st.setGioiTinh(1);
//        st.setId("19120726");
//        st.setName("Vuong Vam Vo");


        student st = StudentDAO.layThongTinSinhVien("19120716");
        course c = CourseDAO.layThongTinCourseTheoTen("Thể dục 2");
        Class cl = ClassDAO.layThongTinClass("19CTT2");
        if (c == null)
            System.out.println("Null roi");
        subject s = SubjectDAO.layThongTinSubjectTheoTen("Cơ sở dữ liệu");
        st.getCourse_student().add(c);
        st.getListSubjects().add(s);
        st.getClass_student().add(cl);

        if (StudentDAO.capNhatThongTinStudent(st) == true) {
            System.out.println("Them thanh cong!");

        } else {
            System.out.println("Them that bai!");
        }

//        student st = StudentDAO.layThongTinSinhVien("19120728");
//        System.out.println(st.getCourse_student().size());

    }
}
