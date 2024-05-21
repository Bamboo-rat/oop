package org.example.testfinal.models;

import jakarta.persistence.*;

@Entity
@Table(name = "OtoXang")
public class OtoXang extends Oto {

    @Column(name = "dungTichXylanh")
    private double dungTichXylanh;
    @Column(name = "momenXoan")
    private  String momenXoan;
    @Column(name = "tieuThuNhienLieu")
    private String tieuThuNhienLieu;

    public double getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(double dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }

    public String getMomenXoan() {
        return momenXoan;
    }

    public void setMomenXoan(String momenXoan) {
        this.momenXoan = momenXoan;
    }

    public String getTieuThuNhienLieu() {
        return tieuThuNhienLieu;
    }

    public void setTieuThuNhienLieu(String tieuThuNhienLieu) {
        this.tieuThuNhienLieu = tieuThuNhienLieu;
    }
}
