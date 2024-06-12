package org.example.testfinal.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNhanVien")
    private int idNhanVien;
    @Column(name = "hoTen")
    private String hoTen;
    @Column(name = "tuoi")
    private int tuoi;
    @Column(name = "chucVu")
    private String chucVu;
    @Column(name = "luongCoSo")
    private double luongCoSo;
    @Column(name = "soNamLamViec")
    private int soNamLamViec;
    @Column(name = "soDienThoai")
    private String soDienThoai;
    @OneToMany(mappedBy = "idNhanVien", cascade = CascadeType.ALL)
    private List<HoaDonBan> listHoaDonBan;


    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuongCoSo() {
        return luongCoSo;
    }

    public void setLuongCoSo(double luongCoSo) {
        this.luongCoSo = luongCoSo;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public List<HoaDonBan> getListHoaDonBan() {
        return listHoaDonBan;
    }

    public void setListHoaDonBan(List<HoaDonBan> listHoaDonBan) {
        this.listHoaDonBan = listHoaDonBan;
    }
}
