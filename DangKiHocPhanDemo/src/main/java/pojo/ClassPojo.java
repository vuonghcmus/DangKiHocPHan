/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author HP
 */
@Entity(name = "class")
public class ClassPojo  {

    @Id
    private String maLop;
    
    @Fetch(FetchMode.JOIN)
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "class_student")
    private Set<student> studentsList = new HashSet<>();

    public ClassPojo() {
    }

    public ClassPojo(String maLop) {
        this.maLop = maLop;
    }

    public Set<student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(Set<student> studentsList) {
        this.studentsList = studentsList;
    }

    

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
    
    public int countNam(){
        int count = 0;
        for (student s : studentsList){
            if (s.getGioiTinh() == 1)
                count++;
        }
        return count;
    }
    
    public int countNu(){
        int count = 0;
        for (student s : studentsList){
            if (s.getGioiTinh() == 0)
                count++;
        }
        return count;
    }
}
