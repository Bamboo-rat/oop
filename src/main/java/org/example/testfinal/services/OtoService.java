package org.example.testfinal.services;

import org.example.testfinal.models.Oto;
import org.example.testfinal.repository.OtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Service
public class OtoService implements IOtoService {
    @Autowired
    private OtoRepository otoRepository;
    @Override
    public List<Oto> getAllOto() {
        return otoRepository.findAll();
    }

    //thêm mới ô tô
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
        Optional<Oto> existingOtoOptional = otoRepository.findById(id);
        if (existingOtoOptional.isPresent()) {

        }
        else
        {
            return null;
        }
    }

}
