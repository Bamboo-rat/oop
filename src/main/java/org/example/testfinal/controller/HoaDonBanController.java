package org.example.testfinal.controller;

import org.example.testfinal.models.HoaDonBan;
import org.example.testfinal.services.HoaDonBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/hoadonban")
public class HoaDonBanController {

    @Autowired
    private HoaDonBanService hoaDonBanService;

    @RequestMapping(value = "laydulieuhoadonban", method = RequestMethod.GET)
    public List<HoaDonBan> getAllHoaDonBan() {
        return hoaDonBanService.getAllHDB();
    }

    @RequestMapping(value = "themhoadonban", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public HoaDonBan addNewHoaDonBan(@RequestBody HoaDonBan hoaDonBan) {
        return hoaDonBanService.addNewHDB(hoaDonBan);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void printHoaDonBan(@PathVariable int id) {
        hoaDonBanService.printHoaDonBan(id);
    }

    @RequestMapping(value = "tongtienthang", method = RequestMethod.GET)
    public int tongTienThang(@RequestParam int thang) {
        return hoaDonBanService.tongTienThang(thang);
    }

    @RequestMapping(value = "tongtienquy", method = RequestMethod.GET)
    public int tongTienQuy(@RequestParam int quy) {
        return hoaDonBanService.tongTienQuy(quy);
    }

    @RequestMapping(value = "tongtiennam", method = RequestMethod.GET)
    public int tongTienNam(@RequestParam int nam) {
        return hoaDonBanService.tongTienNam(nam);
    }
}
