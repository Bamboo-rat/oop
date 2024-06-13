package org.example.testfinal.services;

import org.example.testfinal.models.Oto;
import org.example.testfinal.repository.OtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OtoService implements IOtoService {

    @Autowired
    private OtoRepository otoRepository;
    @Autowired
    private CTHDNService cthdnService;

    @Override
    public List<Oto> getAllOto() {
        return otoRepository.findAll();
    }

    @Override
    public Oto addNewOto(Oto oto) {
        Optional<Oto> existingOtoOptional = otoRepository.findById(oto.getIdXe());
        if (existingOtoOptional.isPresent()) {
            Oto existingOto = existingOtoOptional.get();
            existingOto.setSoLuongTon(existingOto.getSoLuongTon() + oto.getSoLuongTon());
            return otoRepository.save(existingOto);
        } else {
            return otoRepository.save(oto);
        }
    }

    @Override
    public Oto deleteOtoById(int id) {
        Optional<Oto> oto = otoRepository.findById(id);
        if (oto.isEmpty()) {
            return null;
        }
        otoRepository.delete(oto.get());
        return oto.get();
    }

    @Override
    public Oto findOtoById(int id) {
        return otoRepository.findByIdXe(id);
    }

    @Override
    public List<Oto> findOtoByName(String name) {
        return otoRepository.findByTenXeContainsIgnoreCase(name);
    }

    @Override
    public void updateGiaBan(int id, int gia) {
        Optional<Oto> otoOptional = otoRepository.findById(id);
        Oto oto = otoOptional.get();
        oto.setGiaBan(gia);
        otoRepository.save(oto);
    }
}
