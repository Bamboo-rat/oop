package org.example.testfinal.controller;

import org.example.testfinal.models.ChiTietHoaDonBan;
import org.example.testfinal.services.CTHDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/chitiethoadonban")
public class CTHDBController {

    @Autowired
    private CTHDBService cthdbService;

    @RequestMapping(value = "cthoadonban", method = RequestMethod.GET)
    public List<ChiTietHoaDonBan> getAllCTHDB() {
        return cthdbService.getAllCTHDB();
    }

    @RequestMapping(value = "cthoadonban", method = RequestMethod.POST)
    public ChiTietHoaDonBan addNewCTHDB(@RequestBody ChiTietHoaDonBan chiTietHoaDonBan) {
        return cthdbService.addNewCTHDB(chiTietHoaDonBan);
    }
}
