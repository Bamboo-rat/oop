package org.example.testfinal.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "HoaDonNhap")
public class HoaDonNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDonNhap")
    private int maDonNhap;
    @Column(name = "ngayNhap")
    private Date ngayNhap;

    @Column(name = "thanhTien")
    private double thanhTien;
    @OneToMany(mappedBy = "idDonNhap", cascade = CascadeType.ALL)
    private List<ChiTietHoaDonNhap> listCTHDN;

    public int getMaDonNhap() {
        return maDonNhap;
    }

    public void setMaDonNhap(int maDonNhap) {
        this.maDonNhap = maDonNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public List<ChiTietHoaDonNhap> getListCTHDN() {
        return listCTHDN;
    }

    public void setListCTHDN(List<ChiTietHoaDonNhap> listCTHDN) {
        this.listCTHDN = listCTHDN;
    }
}
