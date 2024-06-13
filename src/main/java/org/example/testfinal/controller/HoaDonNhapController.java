package org.example.testfinal.controller;

import org.example.testfinal.models.HoaDonNhap;
import org.example.testfinal.services.HoaDonNhapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/hoadonnhap")
public class HoaDonNhapController {

    @Autowired
    private HoaDonNhapService hoaDonNhapService;

    @RequestMapping(value = "hoadonnhap", method = RequestMethod.GET)
    public List<HoaDonNhap> getAllHoaDonNhap() {
        return hoaDonNhapService.getAllHDN();
    }

    @RequestMapping(value = "hoadonnhap", method = RequestMethod.POST)
    public HoaDonNhap addNewHoaDonNhap(@RequestBody HoaDonNhap hoaDonNhap) {
        return hoaDonNhapService.addNewHDN(hoaDonNhap);
    }

    @RequestMapping(value = "hoadonnhap/{id}", method = RequestMethod.GET)
    public void printHoaDonNhap(@PathVariable int id) {
        hoaDonNhapService.printHoaDonNhap(id);
    }
}
