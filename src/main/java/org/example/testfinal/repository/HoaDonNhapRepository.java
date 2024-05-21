package org.example.testfinal.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.testfinal.models.HoaDonNhap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoaDonNhapRepository extends JpaRepository<HoaDonNhap, Integer> {
}
