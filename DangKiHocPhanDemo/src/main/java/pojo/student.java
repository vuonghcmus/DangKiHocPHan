/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author HP
 */
@Entity(name = "student")
public class student implements Serializable, Comparable {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Class> getClass_student() {
        return class_student;
    }

    public void setClass_student(Set<Class> class_student) {
        this.class_student = class_student;
    }

    

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public student(String id, String name, int gioiTinh, String maMonHoc, String address) {
        this.id = id;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.maMonHoc = maMonHoc;
        this.address = address;
    }

    public Set<subject> getListSubjects() {
        return listSubjects;
    }

    public void setListSubjects(Set<subject> listSubjects) {
        this.listSubjects = listSubjects;
    }

    

    public student() {
    }

    @Fetch(FetchMode.JOIN)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "student_class", joinColumns = @JoinColumn(name = "id_student", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "malop_class", referencedColumnName = "maLop"))
    private Set<Class> class_student = new HashSet<>();    
    
    @Fetch(FetchMode.JOIN)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "id_student", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "maMonHoc_course", referencedColumnName = "maMonHoc"))
    private Set<course> course_student = new HashSet<>();
    
    @Fetch(FetchMode.JOIN)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "student_subject", joinColumns = @JoinColumn(name = "id_student", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "maMonHoc_subject", referencedColumnName = "maMonHoc"))
    private Set<subject> listSubjects = new HashSet<>();

    @Column(name = "gioitinh")
    private int gioiTinh;

    @Column(name = "mamonhoc")
    private String maMonHoc;

    @Column(name = "address")
    private String address;

    

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Set<course> getCourse_student() {
        return course_student;
    }

    public void setCourse_student(Set<course> course_student) {
        this.course_student = course_student;
    }
}
