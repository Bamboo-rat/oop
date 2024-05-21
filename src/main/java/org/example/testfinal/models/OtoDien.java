package org.example.testfinal.models;

import jakarta.persistence.*;

@Entity
@Table(name = "OtoDien")
public class OtoDien extends Oto {

    @Column(name = "dungLuongPin")
    private double dungLuongPin;
    @Column(name = "thoiGianSac")
    private double thoiGianSac;
    @Column(name = "quangDuongDiChuyen")
    private double quangDuongDiMax;

    public double getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(double dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public double getThoiGianSac() {
        return thoiGianSac;
    }

    public void setThoiGianSac(double thoiGianSac) {
        this.thoiGianSac = thoiGianSac;
    }

    public double getQuangDuongDiMax() {
        return quangDuongDiMax;
    }

    public void setQuangDuongDiMax(double quangDuongDiMax) {
        this.quangDuongDiMax = quangDuongDiMax;
    }
}
