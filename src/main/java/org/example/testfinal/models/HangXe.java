package org.example.testfinal.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "HangXe")
public class HangXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHang")
    private int idHang;
    @Column(name = "tenHang")
    private String tenHang;

//     Mối quan hệ một nhiều với Xe
    @OneToMany(mappedBy = "idHang", cascade = CascadeType.ALL)
    private List<Oto> listOto;

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public List<Oto> getListCar() {
        return listOto;
    }

    public void setListCar(List<Oto> listOto) {
        this.listOto = listOto;
    }
}
