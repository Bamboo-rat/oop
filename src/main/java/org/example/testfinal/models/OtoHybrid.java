package org.example.testfinal.models;

import jakarta.persistence.*;

@Entity
@Table(name = "OtoHybrid")
public class OtoHybrid extends Oto {

    @Column(name = "dungTichXylanh")
    private double dungTichXylanh;
    @Column(name = "dungLuongPin")
    private double dungLuongPin;
    @Column(name = "tieuThuNhienLieu")
    private String tieuThuNhienLieu;



    public double getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(double dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public double getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(double dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }

    public String getTieuThuNhienLieu() {
        return tieuThuNhienLieu;
    }

    public void setTieuThuNhienLieu(String tieuThuNhienLieu) {
        this.tieuThuNhienLieu = tieuThuNhienLieu;
    }
}
