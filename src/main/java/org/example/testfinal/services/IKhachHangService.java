package org.example.testfinal.services;

import org.example.testfinal.models.KhachHang;


import java.util.List;

public interface IKhachHangService {
    public List<KhachHang> getAllKhachHang();
    public KhachHang addNewKhachHang(KhachHang kh);
    public KhachHang findById(int id);
    public List<KhachHang> findByHoTen(String name);
}
