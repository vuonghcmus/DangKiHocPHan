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
@Entity(name = "course")
public class course implements Serializable {

    @Id
    private String maMonHoc;

    @Column(name = "tenmon")
    private String tenMon;

    @Column(name = "sotinchi")
    private int soTinChi;

    @Column(name = "gvlt")
    private String gvlt;

    @Column(name = "tenphonghoc")
    private String tenPhongHoc;

    @Column(name = "ngayhoc")
    private String ngayHoc;

    @Column(name = "cahoc")
    private int caHoc;

    @Column(name = "maxSlot")
    private int maxSlot;

    @Fetch(FetchMode.JOIN)
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "course_student")
    private Set<student> listStudent = new HashSet<>();

    public course(String maMonHoc, String tenMon, int soTinChi, String gvlt, String tenPhongHoc, String ngayHoc, int caHoc, int maxSlot) {
        this.maMonHoc = maMonHoc;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
        this.gvlt = gvlt;
        this.tenPhongHoc = tenPhongHoc;
        this.ngayHoc = ngayHoc;
        this.caHoc = caHoc;
        this.maxSlot = maxSlot;
    }

    public course() {
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getGvlt() {
        return gvlt;
    }

    public void setGvlt(String gvlt) {
        this.gvlt = gvlt;
    }

    public String getTenPhongHoc() {
        return tenPhongHoc;
    }

    public void setTenPhongHoc(String tenPhongHoc) {
        this.tenPhongHoc = tenPhongHoc;
    }

    public String getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(String ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    public int getCaHoc() {
        return caHoc;
    }

    public void setCaHoc(int caHoc) {
        this.caHoc = caHoc;
    }

    public int getMaxSlot() {
        return maxSlot;
    }

    public void setMaxSlot(int maxSlot) {
        this.maxSlot = maxSlot;
    }

    public Set<student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(Set<student> listStudent) {
        this.listStudent = listStudent;
    }
}
