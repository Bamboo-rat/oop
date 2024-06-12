package org.example.testfinal.repository;

import org.example.testfinal.models.HangXe;
import org.example.testfinal.models.Oto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OtoRepository extends JpaRepository<Oto, Integer> {
    Oto findByIdXe(int id);
    List<Oto> findByTenXeContainsIgnoreCase(String name);
}
