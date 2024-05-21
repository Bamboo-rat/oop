package org.example.testfinal.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ChiTietHoaDonBan")
public class ChiTietHoaDonBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCTHDB")
    private int idCTHDB;
    @Column(name = "soLuongXe")
    private int soLuongXe;
    @ManyToOne
    @JoinColumn(name = "idDonBan")
    @JsonIgnore
    private HoaDonBan idDonBan;
    @ManyToOne
    @JoinColumn(name = "idXe")
    @JsonIgnore
    private Oto idXe;

    public int getIdCTHDB() {
        return idCTHDB;
    }

    public void setIdCTHDB(int idCTHDB) {
        this.idCTHDB = idCTHDB;
    }

    public int getSoLuongXe() {
        return soLuongXe;
    }

    public void setSoLuongXe(int soLuongXe) {
        this.soLuongXe = soLuongXe;
    }


    public HoaDonBan getIdDonBan() {
        return idDonBan;
    }

    public void setIdDonBan(HoaDonBan idDonBan) {
        this.idDonBan = idDonBan;
    }

    public Oto getIdXe() {
        return idXe;
    }

    public void setIdXe(Oto idXe) {
        this.idXe = idXe;
    }
}
