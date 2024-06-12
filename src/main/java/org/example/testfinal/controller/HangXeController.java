package org.example.testfinal.controller;

import org.example.testfinal.models.HangXe;
import org.example.testfinal.models.Oto;
import org.example.testfinal.services.HangXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/version1.0")
public class HangXeController {

    @Autowired
    private HangXeService hangXeService;

    @GetMapping(value = "laydulieuhangxe")
    public List<HangXe> getAllHangXe() {
        return hangXeService.getAllHangXe();
    }

    @PostMapping(value = "themhxe", produces = MediaType.APPLICATION_JSON_VALUE)
    public HangXe addNewHangXe(@RequestBody HangXe hangXe) {
        return hangXeService.addNewHang(hangXe);
    }

    @DeleteMapping(value = "xoahangxe", produces = MediaType.APPLICATION_JSON_VALUE)
    public HangXe deleteHangXeById(@RequestParam int id) {
        return hangXeService.deleteHangOtoById(id);
    }

    @GetMapping(value = "timhangxe", produces = MediaType.APPLICATION_JSON_VALUE)
    public HangXe findHangXeById(@RequestParam int id) {
        return hangXeService.findHangOtoById(id);
    }

    @GetMapping(value = "timototheohangxe", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Oto> findOtoByIdHang(@RequestParam int idhang) {
        return hangXeService.findOtoByIdHang(idhang);
    }
}
