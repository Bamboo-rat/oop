package org.example.testfinal.services;

import org.example.testfinal.models.ChiTietHoaDonBan;

import java.util.List;

public interface ICTHDBService {
    public List<ChiTietHoaDonBan> getAllCTHDB();
    public ChiTietHoaDonBan addNewCTHDB(ChiTietHoaDonBan chiTietHoaDonBan);
    public List<ChiTietHoaDonBan> findByIdHDB(int idHDB);
}
