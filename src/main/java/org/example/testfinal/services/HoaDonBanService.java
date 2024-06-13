package org.example.testfinal.services;

import org.example.testfinal.models.ChiTietHoaDonBan;
import org.example.testfinal.models.ChiTietHoaDonNhap;
import org.example.testfinal.models.HoaDonBan;
import org.example.testfinal.repository.CTHDBRepository;
import org.example.testfinal.repository.CTHDNRepository;
import org.example.testfinal.repository.HoaDonBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HoaDonBanService implements IHoaDonBanService {
    @Autowired
    private HoaDonBanRepository hoaDonBanRepository;
    @Autowired
    private CTHDBService cthdbService;

    @Override
    public List<HoaDonBan> getAllHDB() {
        return hoaDonBanRepository.findAll();
    }

    @Override
    public HoaDonBan addNewHDB(HoaDonBan hoaDonBan) {
        return hoaDonBanRepository.save(hoaDonBan);
    }

    @Override
    public void printHoaDonBan(int idHoaDonBan) {
        List<ChiTietHoaDonBan> chiTietHoaDonBanList = cthdbService.findByIdHDB(idHoaDonBan);
        for (ChiTietHoaDonBan cthdb : chiTietHoaDonBanList) {
            System.out.println("Thông tin chi tiết hóa đơn bán:");
            // In thông tin chi tiết hóa đơn bán
            System.out.println(cthdb.toString());
        }
    }

    @Override
    public void tongTienHDB(int idHDB) {
        Optional<HoaDonBan> hoaDonBan = hoaDonBanRepository.findById(idHDB);
        List<ChiTietHoaDonBan> chiTietHoaDonBanList = cthdbService.findByIdHDB(idHDB);
        int thanhTien = 0;
        for (ChiTietHoaDonBan cthdb : chiTietHoaDonBanList) {
            thanhTien += cthdb.getThanhTien();
        }
        hoaDonBan.get().setTongTien(thanhTien);
    }

    @Override
    public int tongTienThang(int thang) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, thang - 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date startDate = cal.getTime();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date endDate = cal.getTime();

        List<HoaDonBan> hoaDonBans = hoaDonBanRepository.findByNgayLapBetween(startDate, endDate);
        return hoaDonBans.stream().mapToInt(HoaDonBan::getTongTien).sum();
    }

    @Override
    public int tongTienQuy(int quy) {
        int startMonth = (quy - 1) * 3;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, startMonth);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date startDate = cal.getTime();
        cal.set(Calendar.MONTH, startMonth + 2);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date endDate = cal.getTime();

        List<HoaDonBan> hoaDonBans = hoaDonBanRepository.findByNgayLapBetween(startDate, endDate);
        return hoaDonBans.stream().mapToInt(HoaDonBan::getTongTien).sum();
    }

    @Override
    public int tongTienNam(int nam) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, nam);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date startDate = cal.getTime();
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        Date endDate = cal.getTime();

        List<HoaDonBan> hoaDonBans = hoaDonBanRepository.findByNgayLapBetween(startDate, endDate);
        return hoaDonBans.stream().mapToInt(HoaDonBan::getTongTien).sum();
    }
}
