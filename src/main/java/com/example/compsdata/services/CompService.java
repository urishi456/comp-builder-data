package com.example.compsdata.services;

import com.example.compsdata.model.Comp;
import com.example.compsdata.repo.CompRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompService {
    private final CompRepo compRepo;

    @Autowired
    public CompService(CompRepo compRepo) {
        this.compRepo = compRepo;
    }

    public List<Comp> getAllComps() {
        return compRepo.findAll();
    }

    public Comp addComp (Comp comp) {
        return compRepo.save(comp);
    }

    public Comp updateComp (Comp comp) {
        return compRepo.save(comp);
    }

    public void deleteComp (Long id) {
        compRepo.deleteById(id);
    }
}
