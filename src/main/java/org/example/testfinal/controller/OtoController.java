package org.example.testfinal.controller;

import com.google.gson.Gson;
import org.example.testfinal.models.Oto;
import org.example.testfinal.services.OtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "api/version1.0")
public class OtoController {
    @Autowired
    private OtoService otoService;
    @RequestMapping(value = "laydulieuoto",method = RequestMethod.GET)
    public List<Oto> getAllOto()
    {
        return otoService.getAllOto();
    }
    @RequestMapping(value = "them1oto",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public Oto addNewOto(@RequestBody String oto)
    {
        Gson gson = new Gson();
        Oto ot = gson.fromJson(oto, Oto.class);
        return  otoService.addNewOto(ot);
    }
}
