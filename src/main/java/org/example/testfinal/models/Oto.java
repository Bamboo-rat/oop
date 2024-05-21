package org.example.testfinal.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Oto")
public class Oto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idXe")
    private int idXe;
    @ManyToOne
    @JoinColumn(name = "idHang")
    @JsonIgnore
    private HangXe idHang;
    @Column(name = "tenXe")
    private String tenXe;
    @Column(name = "namSanXuat")
    private int namSanXuat;
    @Column(name = "mauSac")
    private String mauSac;
    @Column(name = "soChoNgoi")
    private int soChoNgoi;
    @Column(name = "hopSo")
    private String hopSo;
    @Column(name = "congSuatDongCo")
    private String congSuatDongCo;

    @Column(name = "giaBan")
    private double giaBan;
    @Column(name = "phienBan")
    private String phienBan;
    @Column(name = "soLuongTon")
    private int soLuongTon;
    @OneToMany(mappedBy = "idXe", cascade = CascadeType.ALL)
    private List<ChiTietHoaDonBan> listCTHDB;
    @OneToMany(mappedBy = "idXe", cascade = CascadeType.ALL)
    private List<ChiTietHoaDonNhap> listCTHDN;

    public int getIdXe() {
        return idXe;
    }

    public void setIdXe(int idXe) {
        this.idXe = idXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public HangXe getIdHang() {
        return idHang;
    }

    public void setIdHang(HangXe idHang) {
        this.idHang = idHang;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }


    public String getHopSo() {
        return hopSo;
    }

    public void setHopSo(String hopSo) {
        this.hopSo = hopSo;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public String getCongSuatDongCo() {
        return congSuatDongCo;
    }

    public void setCongSuatDongCo(String congSuatDongCo) {
        this.congSuatDongCo = congSuatDongCo;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public List<ChiTietHoaDonBan> getListCTHDB() {
        return listCTHDB;
    }

    public void setListCTHDB(List<ChiTietHoaDonBan> listCTHDB) {
        this.listCTHDB = listCTHDB;
    }

    public List<ChiTietHoaDonNhap> getListCTHDN() {
        return listCTHDN;
    }

    public void setListCTHDN(List<ChiTietHoaDonNhap> listCTHDN) {
        this.listCTHDN = listCTHDN;
    }
}
