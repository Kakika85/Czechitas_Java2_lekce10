package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.repository.RodicRepository;
import org.springframework.stereotype.Service;

@Service
public class RodiceService {
    private final RodicRepository rodicRepository;

    public RodiceService(RodicRepository rodicRepository) {
        this.rodicRepository = rodicRepository;
    }
}
