package org.example.testfinal.repository;

import org.example.testfinal.models.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien,Integer> {
    NhanVien findByIdNhanVien(int id);
    List<NhanVien> findByHoTenContains(String name);
    List<NhanVien> findByChucVuContains(String chucVu);
}
