/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author HP
 */
@Entity(name = "subject")
public class subject {
    @Id
    private String maMonHoc;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "soTinChi")
    private int soTinChi;
    
    @Fetch(FetchMode.JOIN)
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "listSubjects")
    private Set<student> studentsList = new HashSet<>();

    public subject() {
    }

    public Set<student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(Set<student> studentsList) {
        this.studentsList = studentsList;
    }


    public subject(String maMonHoc, String name, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.name = name;
        this.soTinChi = soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
}
