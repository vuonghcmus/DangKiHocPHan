/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

//import java.util.Date;
import javax.persistence.*;
//import java.sql.Date;

/**
 *
 * @author HP
 */
@Entity(name = "semester")
public class semester {

    @Id
    private String ngayBatDau;

    @Column(name = "year")
    private String year;

    @Column(name = "name")
    private String name;

    @Column(name = "ngayketthuc")
    private String ngayKetThuc;

    @Column(name = "hkhientai")
    private int hocKyHienTai;

    public semester() {
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHocKyHienTai() {
        return hocKyHienTai;
    }

    public void setHocKyHienTai(int hocKyHienTai) {
        this.hocKyHienTai = hocKyHienTai;
    }

    public semester(String ngayBatDau, String year, String name, String ngayKetThuc, int hocKyHienTai) {
        this.ngayBatDau = ngayBatDau;
        this.year = year;
        this.name = name;
        this.ngayKetThuc = ngayKetThuc;
        this.hocKyHienTai = hocKyHienTai;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
