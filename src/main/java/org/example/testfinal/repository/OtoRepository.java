package org.example.testfinal.repository;

import org.example.testfinal.models.Oto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtoRepository extends JpaRepository<Oto, Integer> {
}
