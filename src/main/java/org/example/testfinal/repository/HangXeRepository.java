package org.example.testfinal.repository;

import org.example.testfinal.models.HangXe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HangXeRepository extends JpaRepository<HangXe,Integer> {
    HangXe findByIdHang(int id);
}
