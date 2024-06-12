package org.example.testfinal.services;

import org.example.testfinal.repository.CTHDNRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CTHDNService implements ICTHDNService{
    @Autowired
    private CTHDNRepository cthdnRepository;
}
