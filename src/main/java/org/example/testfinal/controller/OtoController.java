package org.example.testfinal.controller;

import org.example.testfinal.models.Oto;
import org.example.testfinal.services.OtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/version1.0")
public class OtoController {

    @Autowired
    private OtoService otoService;

    @GetMapping(value = "laydulieuoto")
    public List<Oto> getAllOto() {
        return otoService.getAllOto();
    }

    @PostMapping(value = "them1oto", produces = MediaType.APPLICATION_JSON_VALUE)
    public Oto addNewOto(@RequestBody Oto oto) {
        return otoService.addNewOto(oto);
    }

    @DeleteMapping(value = "xoaototheoid", produces = MediaType.APPLICATION_JSON_VALUE)
    public Oto deleteOtoById(@RequestParam int id) {
        return otoService.deleteOtoById(id);
    }

    @GetMapping(value = "timototheoid")
    public Oto findOtoById(@RequestParam int id) {
        return otoService.findOtoById(id);
    }

    @GetMapping(value = "timototheoten")
    public List<Oto> findOtoByName(@RequestParam String name) {
        return otoService.findOtoByName(name);
    }

}
