package org.example.testfinal.services;

import org.example.testfinal.models.ChiTietHoaDonNhap;
import org.example.testfinal.models.HoaDonNhap;
import org.example.testfinal.repository.CTHDNRepository;
import org.example.testfinal.repository.HoaDonNhapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonNhapService implements IHoaDonNhapService{
    @Autowired
    private HoaDonNhapRepository hoaDonNhapRepository;
    @Autowired
    private CTHDNRepository cthdnRepository;

    @Override
    public List<HoaDonNhap> getAllHDN() {
        return hoaDonNhapRepository.findAll();
    }

    @Override
    public HoaDonNhap addNewHDN(HoaDonNhap hoaDonNhap) {
        return hoaDonNhapRepository.save(hoaDonNhap);
    }

    @Override
    public void printHoaDonNhap(int idHoaDonNhap) {
        List<ChiTietHoaDonNhap> chiTietHoaDonNhapList = cthdnRepository.findByIdDonNhap(idHoaDonNhap);
        for (ChiTietHoaDonNhap cthdn : chiTietHoaDonNhapList) {
            System.out.println("Thông tin chi tiết hóa đơn nhập:");
            // In thông tin chi tiết hóa đơn nhập
            System.out.println(cthdn.toString());
        }
    }
}
