package org.example.testfinal.controller;

import com.google.gson.Gson;
import org.example.testfinal.models.NhanVien;
import org.example.testfinal.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/version1.0")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping(value = "laydulieunhanvien")
    public List<NhanVien> getAllNhanVien() {
        return nhanVienService.getAllNhanVien();
    }

    @PostMapping(value = "them1nhanvien", produces = MediaType.APPLICATION_JSON_VALUE)
    public NhanVien addNewNhanVien(@RequestBody String nv) {
        Gson gson = new Gson();
        NhanVien nvien = gson.fromJson(nv, NhanVien.class);
        return nhanVienService.addNewNhanVien(nvien);
    }

    @DeleteMapping(value = "xoa1nhanvientheoid", produces = MediaType.APPLICATION_JSON_VALUE)
    public NhanVien deleteNhanVienById(@RequestParam int id) {
        return nhanVienService.deleteNhanVienById(id);
    }

    @GetMapping(value = "timnhanvientheoid")
    public NhanVien findNhanVienById(@RequestParam int id) {
        return nhanVienService.findById(id);
    }

    @GetMapping(value = "timnhanvientheoten")
    public List<NhanVien> findNhanVienByName(@RequestParam String name) {
        return nhanVienService.findByHoTen(name);
    }

    @GetMapping(value = "timnhanvientheochucvu")
    public List<NhanVien> findNhanVienByChucVu(@RequestParam String chucVu) {
        return nhanVienService.findByChucVu(chucVu);
    }
}
