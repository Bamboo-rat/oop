package org.example.testfinal.services;

import org.example.testfinal.repository.HoaDonNhapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoaDonNhapService implements IHoaDonNhapService{
    @Autowired
    private HoaDonNhapRepository hoaDonNhapRepository;
}
