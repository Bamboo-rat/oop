package org.example.testfinal.services;

import org.example.testfinal.repository.CTHDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CTHDBService implements ICTHDBService{
    @Autowired
    private CTHDBRepository cthdbRepository;
}
