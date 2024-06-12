package org.example.testfinal.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "ChiTietHoaDonNhap")
public class ChiTietHoaDonNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCTHDN")
    private int idCTHDN;
    @Column(name = "soLuongXe")
    private int soLuongXe;
    @ManyToOne
    @JoinColumn(name = "idDonNhap")
    @JsonIgnore
    private HoaDonNhap idDonNhap;
    @ManyToOne
    @JoinColumn(name = "idXe")
    @JsonIgnore
    private Oto idXe;
    @Column(name = "donGia")
    private int donGia;

    @Column(name = "thanhTien")
    private int thanhTien;


    public int getIdCTHDN() {
        return idCTHDN;
    }

    public void setIdCTHDN(int idCTHDN) {
        this.idCTHDN = idCTHDN;
    }

    public int getSoLuongXe() {
        return soLuongXe;
    }

    public void setSoLuongXe(int soLuongXe) {
        this.soLuongXe = soLuongXe;
    }

    public HoaDonNhap getIdDonNhap() {
        return idDonNhap;
    }

    public void setIdDonNhap(HoaDonNhap idDonNhap) {
        this.idDonNhap = idDonNhap;
    }

    public Oto getIdXe() {
        return idXe;
    }

    public void setIdXe(Oto idXe) {
        this.idXe = idXe;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getThanhTien() {
        return thanhTien = getDonGia() * soLuongXe;
    }
}
