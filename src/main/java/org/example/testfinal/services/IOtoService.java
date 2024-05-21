package org.example.testfinal.services;

import org.example.testfinal.models.Oto;

import java.util.List;

public interface IOtoService {
    // định nghĩa những phương thức  <liên quan tính trừu tượng>
    public List<Oto> getAllOto();
    public Oto addNewOto(Oto oto);
    public Oto deleteOtoById(int id);
}
