package org.example.testfinal.services;

import org.example.testfinal.models.HoaDonBan;

import java.util.List;

public interface IHoaDonBanService {
    public List<HoaDonBan> getAllHDB();
    public HoaDonBan addNewHDB(HoaDonBan hoaDonBan);
    public int tongTienThang(int thang);
    public int tongTienQuy(int quy);
    public int tongTienNam(int nam);
}
