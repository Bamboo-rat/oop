package org.example.testfinal.repository;

import org.example.testfinal.models.HoaDonBan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface HoaDonBanRepository extends JpaRepository<HoaDonBan,Integer> {
    List<HoaDonBan> findByNgayLapBetween(Date startDate, Date endDate);
}
