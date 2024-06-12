package org.example.testfinal.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "HoaDonBan")
public class HoaDonBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDonBan")
    private int maDonBan;
    @Column(name = "ngayLap")
    private Date ngayLap;
    @Column(name = "tongTien")
    private int tongTien;
    @ManyToOne
    @JoinColumn(name = "idNhanVien")
    @JsonIgnore
    private NhanVien idNhanVien;
    @ManyToOne
    @JoinColumn(name = "idKhachHang")
    @JsonIgnore
    private KhachHang idKhachHang;
    @OneToMany(mappedBy = "idDonBan", cascade = CascadeType.ALL)
    private List<ChiTietHoaDonBan> listCTHDB;

    public int getMaDonBan() {
        return maDonBan;
    }

    public void setMaDonBan(int maDonBan) {
        this.maDonBan = maDonBan;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public NhanVien getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(NhanVien idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public KhachHang getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(KhachHang idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public List<ChiTietHoaDonBan> getListCTHDB() {
        return listCTHDB;
    }

    public void setListCTHD(List<ChiTietHoaDonBan> listCTHDB) {
        this.listCTHDB = listCTHDB;
    }
}
