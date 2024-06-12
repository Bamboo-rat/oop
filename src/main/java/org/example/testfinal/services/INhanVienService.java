package org.example.testfinal.services;

import org.example.testfinal.models.NhanVien;

import java.util.List;

public interface INhanVienService {
    public List<NhanVien> getAllNhanVien();
    public NhanVien addNewNhanVien(NhanVien nv);
    public NhanVien deleteNhanVienById(int id);
    public NhanVien findById(int id);
    public List<NhanVien> findByHoTen(String name);
    public List<NhanVien> findByChucVu(String chucVu);
}
