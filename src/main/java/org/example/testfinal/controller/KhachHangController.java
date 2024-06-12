package org.example.testfinal.controller;

import org.example.testfinal.models.KhachHang;
import org.example.testfinal.services.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/version1.0")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping(value = "laydulieukhachhang")
    public List<KhachHang> getAllKhachHang() {
        return khachHangService.getAllKhachHang();
    }

    @PostMapping(value = "themkhachhang", produces = MediaType.APPLICATION_JSON_VALUE)
    public KhachHang addNewKhachHang(@RequestBody KhachHang khachHang) {
        return khachHangService.addNewKhachHang(khachHang);
    }

    @DeleteMapping(value = "xoakhachhang", produces = MediaType.APPLICATION_JSON_VALUE)
    public KhachHang deleteKhachHangById(@RequestParam int id) {
        return khachHangService.findById(id);
    }

    @GetMapping(value = "timkhachhangtheoid", produces = MediaType.APPLICATION_JSON_VALUE)
    public KhachHang findKhachHangById(@RequestParam int id) {
        return khachHangService.findById(id);
    }

    @GetMapping(value = "timkhachhangtheoten", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<KhachHang> findKhachHangByName(@RequestParam String name) {
        return khachHangService.findByHoTen(name);
    }
}
