package org.example.testfinal.repository;

import org.example.testfinal.models.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KhachHangRepository extends JpaRepository<KhachHang,Integer> {
    List<KhachHang> findByHoTenContainsIgnoreCase(String name);
}
