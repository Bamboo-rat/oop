package org.example.testfinal.services;

import org.example.testfinal.models.NhanVien;
import org.example.testfinal.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService implements INhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien addNewNhanVien(NhanVien nv) {
        Optional<NhanVien> optionalNhanVien = nhanVienRepository.findById(nv.getIdNhanVien());
        if (optionalNhanVien.isPresent()) {
            return null;
        } else {
            return nhanVienRepository.save(nv);
        }
    }

    @Override
    public NhanVien deleteNhanVienById(int id) {
        Optional<NhanVien> optionalNhanVien = nhanVienRepository.findById(id);
        if (optionalNhanVien.isPresent()) {
            NhanVien existingNhanVien = optionalNhanVien.get();
            nhanVienRepository.delete(existingNhanVien);
            return existingNhanVien;
        }
        else
        {
            return null;
        }
    }

    @Override
    public NhanVien findById(int id) {
        return nhanVienRepository.findByIdNhanVien(id);
    }

    @Override
    public List<NhanVien> findByHoTen(String name) {
        return nhanVienRepository.findByHoTenContains(name);
    }

    @Override
    public List<NhanVien> findByChucVu(String chucVu) {
        return nhanVienRepository.findByChucVuContains(chucVu);
    }
}
