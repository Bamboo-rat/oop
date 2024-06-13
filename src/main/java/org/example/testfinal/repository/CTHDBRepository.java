package org.example.testfinal.repository;

import org.example.testfinal.models.ChiTietHoaDonBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CTHDBRepository extends JpaRepository<ChiTietHoaDonBan, Long> {

    List<ChiTietHoaDonBan> findByHoaDonBan_Id(int idDonBan); // Assuming ChiTietHoaDonBan has a relationship with HoaDonBan
}
