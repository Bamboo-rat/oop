package org.example.testfinal.services;

import org.example.testfinal.models.ChiTietHoaDonNhap;
import org.example.testfinal.models.Oto;
import org.example.testfinal.repository.CTHDNRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CTHDNService implements ICTHDNService {
    @Autowired
    private CTHDNRepository cthdnRepository;
    @Autowired
    private OtoService otoService;

    @Override
    public List<ChiTietHoaDonNhap> getAllCTHDN() {
        return cthdnRepository.findAll();
    }

    @Override
    public ChiTietHoaDonNhap addNewCTHDN(ChiTietHoaDonNhap chiTietHoaDonNhap) {
        ChiTietHoaDonNhap savedCTHDN = cthdnRepository.save(chiTietHoaDonNhap);
        int giaNhap = (int) (chiTietHoaDonNhap.getDonGia()*1.1);
        otoService.updateGiaBan(chiTietHoaDonNhap.getIdXe().getIdXe(),giaNhap);
        Oto oto = otoService.findOtoById(chiTietHoaDonNhap.getIdXe().getIdXe());
        oto.setSoLuongTon(oto.getSoLuongTon() + chiTietHoaDonNhap.getSoLuongXe());
        return savedCTHDN;
    }
}
