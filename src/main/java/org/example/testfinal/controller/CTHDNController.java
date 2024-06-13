package org.example.testfinal.controller;

import org.example.testfinal.models.ChiTietHoaDonNhap;
import org.example.testfinal.services.CTHDNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/chitiethoadonnhap")
public class CTHDNController {

    @Autowired
    private CTHDNService cthdnService;

    @RequestMapping(value = "cthoandonhap", method = RequestMethod.GET)
    public List<ChiTietHoaDonNhap> getAllCTHDN() {
        return cthdnService.getAllCTHDN();
    }

    @RequestMapping(value = "cthoandonhap", method = RequestMethod.POST)
    public ChiTietHoaDonNhap addNewCTHDN(@RequestBody ChiTietHoaDonNhap chiTietHoaDonNhap) {
        return cthdnService.addNewCTHDN(chiTietHoaDonNhap);
    }
}
