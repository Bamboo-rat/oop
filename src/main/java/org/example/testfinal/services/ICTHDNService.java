package org.example.testfinal.services;

import org.example.testfinal.models.ChiTietHoaDonNhap;

import java.util.List;

public interface ICTHDNService {
    public List<ChiTietHoaDonNhap> getAllCTHDN();
    public ChiTietHoaDonNhap addNewCTHDN(ChiTietHoaDonNhap chiTietHoaDonNhap);
}