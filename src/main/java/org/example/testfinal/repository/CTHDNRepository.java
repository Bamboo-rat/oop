package org.example.testfinal.repository;

import org.example.testfinal.models.ChiTietHoaDonNhap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CTHDNRepository extends JpaRepository<ChiTietHoaDonNhap,Integer> {
    List<ChiTietHoaDonNhap> findByIdDonNhap(int id);
}
