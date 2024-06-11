package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Rodic;
import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.repository.RodicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RodiceService {
    private final RodicRepository rodicRepository;

    public RodiceService(RodicRepository rodicRepository) {
        this.rodicRepository = rodicRepository;
    }

    public List<Rodic> findAll(){
        return rodicRepository.findAll();
    }

    public Rodic findById(int id) {
        return rodicRepository.findById(id).orElse(null);
    }
}
