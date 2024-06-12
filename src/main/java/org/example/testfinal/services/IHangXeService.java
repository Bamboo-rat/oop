package org.example.testfinal.services;

import org.example.testfinal.models.HangXe;
import org.example.testfinal.models.Oto;

import java.util.List;

public interface IHangXeService {
    public List<HangXe> getAllHangXe();
    public HangXe addNewHang(HangXe hangXe);
    public HangXe deleteHangOtoById(int id);
    public HangXe findHangOtoById(int id);
    public List<Oto> findOtoByIdHang(int idHang);
}
