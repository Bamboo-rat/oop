package org.example.testfinal.services;

import org.example.testfinal.models.ChiTietHoaDonBan;
import org.example.testfinal.models.Oto;
import org.example.testfinal.repository.CTHDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CTHDBService implements ICTHDBService {
    @Autowired
    private CTHDBRepository cthdbRepository;
    @Autowired
    private OtoService otoService;

    @Override
    public List<ChiTietHoaDonBan> getAllCTHDB() {
        return cthdbRepository.findAll();
    }

    @Override
    public ChiTietHoaDonBan addNewCTHDB(ChiTietHoaDonBan chiTietHoaDonBan) {
        Oto oto = otoService.findOtoById(chiTietHoaDonBan.getIdXe().getIdXe());
        oto.setSoLuongTon(oto.getSoLuongTon() - chiTietHoaDonBan.getSoLuongXe());
        chiTietHoaDonBan.setThanhTien(chiTietHoaDonBan.getSoLuongXe() * oto.getGiaBan());
        ChiTietHoaDonBan savedChiTietHoaDonBan = cthdbRepository.save(chiTietHoaDonBan);
        return savedChiTietHoaDonBan;
    }

    @Override
    public List<ChiTietHoaDonBan> findByIdHDB(int idHDB) {
        List<ChiTietHoaDonBan> list = cthdbRepository.findAll();
        List<ChiTietHoaDonBan> donBanList = new ArrayList<>();
        for (ChiTietHoaDonBan a: list)
        {
            if(a.getIdDonBan().getMaDonBan() == idHDB)
                donBanList.add(a);
        }
        return donBanList;
    }
}
