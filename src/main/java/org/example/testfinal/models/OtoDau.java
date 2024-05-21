package org.example.testfinal.models;

import jakarta.persistence.*;

@Entity
@Table(name = "OtoDau")
public class OtoDau extends Oto {

    @Column(name = "dungTichXylanh")
    private double dungTichXylanh;
    @Column(name = "momenXoan")
    private  String momenXoan;
    @Column(name = "tieuThuNhienLieu")
    private String tieuThuNhienLieu;
    @Column(name = "lucKeo")
    private double lucKeo;

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

    public double getLucKeo() {
        return lucKeo;
    }

    public void setLucKeo(double lucKeo) {
        this.lucKeo = lucKeo;
    }
}
