package org.example.testfinal.services;


import org.example.testfinal.models.KhachHang;
import org.example.testfinal.models.NhanVien;
import org.example.testfinal.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService implements IKhachHangService{
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang addNewKhachHang(KhachHang kh) {
        Optional<KhachHang> optionalKhachHang = khachHangRepository.findById(kh.getIdKhachHang());
        if (optionalKhachHang.isPresent()) {
            return null;
        } else {
            return khachHangRepository.save(kh);
        }
    }

    @Override
    public KhachHang findById(int id) {
        Optional<KhachHang> optionalKhachHang = khachHangRepository.findById(id);
        if (optionalKhachHang.isPresent()) {
            KhachHang existingKhachHang = optionalKhachHang.get();
            khachHangRepository.delete(existingKhachHang);
            return existingKhachHang;
        }
        else
        {
            return null;
        }
    }

    @Override
    public List<KhachHang> findByHoTen(String name) {
        return khachHangRepository.findByHoTenContainsIgnoreCase(name);
    }
}
