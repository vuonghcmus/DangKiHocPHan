/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ClassDAO;
import dao.CourseDAO;
import dao.DangKiHocPhanDAO;
import dao.StudentDAO;
import dao.SubjectDAO;
import dao.TeacherDAO;
import dao.UserDAO;
import dao.semesterDAO;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import pojo.semester;
import pojo.student;
import pojo.teacher;
import pojo.user;
import pojo.ClassPojo;
import pojo.dangKiHocPhan;
import pojo.subject;
import pojo.course;

/**
 *
 * @author HP
 */
public class main {
    
    public static void main(String[] args) {

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
//        String s1 = "15-03-2021";
//        String s2 = "10-04-2021";
//        
//        String[] S1 = s1.split("-");
//        String[] S2 = s2.split("-");
//        
//        if (checkNgayLonHon(S1, S2) == 1) {
//            System.out.println("S1 > S2");
//        } else if (checkNgayLonHon(S1, S2) == 0) {
//            System.out.println("S1 = S2");
//        } else {
//            System.out.println("S1 < S2");
//        }

        List<dangKiHocPhan> dk = DangKiHocPhanDAO.layThongTinDKHPTheoTen("HK2 - 2021");
        for (dangKiHocPhan x : dk) {
            System.out.println(x.getNgayKetThuc());
        }
        

    }
    
    public static int checkNgayLonHon(String[] s1, String[] s2) {
        if (s1[2].equals(s2[2]) && s1[1].equals(s2[1]) && s1[0].equals(s2[0])) {
            return 0;
        }
        
        for (int i = 2; i >= 0; i--) {
            if ((s1[i]).compareTo(s2[i]) < 0) {
                return -1;
            } else if ((s1[i]).compareTo(s2[i]) > 0) {
                return 1;
            }
        }
        return 1;
    }
}
