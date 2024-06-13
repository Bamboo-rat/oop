package org.example.testfinal.services;

import org.example.testfinal.models.HoaDonNhap;

import java.util.List;

public interface IHoaDonNhapService {
    public List<HoaDonNhap> getAllHDN();
    public HoaDonNhap addNewHDN(HoaDonNhap hoaDonNhap);
    public void printHoaDonNhap(int idHoaDonNhap);

}
