package org.example.testfinal.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idKhachHang")
    private int idKhachHang;
    @Column(name = "hoTen")
    private String hoTen;

    @Column(name = "diaChi")
    private String diaChi;
    @Column(name = "soDienThoai")
    private String soDienThoai;
    @OneToMany(mappedBy = "idKhachHang", cascade = CascadeType.ALL)
    private List<HoaDonBan> listHDB;

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public List<HoaDonBan> getListHDB() {
        return listHDB;
    }

    public void setListHDB(List<HoaDonBan> listHDB) {
        this.listHDB = listHDB;
    }
}
