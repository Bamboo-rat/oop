package org.example.testfinal.services;

import org.example.testfinal.models.HangXe;
import org.example.testfinal.models.Oto;
import org.example.testfinal.repository.HangXeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HangXeService implements IHangXeService{
    @Autowired
    private HangXeRepository hangXeRepository;

    @Override
    public List<HangXe> getAllHangXe() {
        return hangXeRepository.findAll();
    }

    @Override
    public HangXe addNewHang(HangXe hangXe) {
        Optional<HangXe> existingHangXe = hangXeRepository.findById(hangXe.getIdHang());
        if (existingHangXe.isPresent()) {
            return null;
        } else {
            return hangXeRepository.save(hangXe);
        }
    }

    @Override
    public HangXe deleteHangOtoById(int id) {
        Optional<HangXe> hangXe = hangXeRepository.findById(id);
        if (hangXe.isEmpty()) {
            return null;
        }
        hangXeRepository.delete(hangXe.get());
        return hangXe.get();
    }

    @Override
    public HangXe findHangOtoById(int id) {
        return hangXeRepository.findByIdHang(id);
    }

    @Override
    public List<Oto> findOtoByIdHang(int idHang) {
        Optional<HangXe> hangXeOptional = hangXeRepository.findById(idHang);
        if (hangXeOptional.isPresent()) {
            HangXe hangXe = hangXeOptional.get();
            return hangXe.getListCar();
        }
        return new ArrayList<>();
    }
}
