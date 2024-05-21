package org.example.testfinal.services;

import org.example.testfinal.models.NhanVien;
import org.example.testfinal.models.Oto;
import org.example.testfinal.repository.NhanVienRepository;
import org.example.testfinal.repository.OtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class NhanVienService implements INhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }
}
