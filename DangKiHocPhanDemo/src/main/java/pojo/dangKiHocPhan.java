/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.*;

/**
 *
 * @author HP
 */

@Entity(name = "dangkihocphan")
public class dangKiHocPhan {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "ngaybatdau")
    private String ngayBatDau;
    
    @Column(name = "ngayketthuc")
    private String ngayKetThuc;
    
    @Column(name = "hkhientai")
    private int hkHienTai;

    public dangKiHocPhan() {
    }

    public dangKiHocPhan(int id, String name, String ngayBatDau, String ngayKetThuc, int hkHienTai) {
        this.id = id;
        this.name = name;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.hkHienTai = hkHienTai;
    }

    public int getHkHienTai() {
        return hkHienTai;
    }

    public void setHkHienTai(int hkHienTai) {
        this.hkHienTai = hkHienTai;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
