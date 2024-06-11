package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Služby pro práci se školními třídami.
 */
@Service
public class TridyService {
    private final TridaRepository tridaRepository;
    private final StudentRepository studentRepository;

    public TridyService(TridaRepository tridaRepository, StudentRepository studentRepository) {
        this.tridaRepository = tridaRepository;
        this.studentRepository = studentRepository;
    }

    /**
     * Vrací seznam všech tříd.
     * @return Seznam tříd.
     */
    public List<Trida> findAll() {
        return tridaRepository.findAll();
    }

    /**
     * Vrací detail třídy.
     * @param id Identifikátor třídy.
     * @return Detail třídy nebo {@code null}.
     */
    public Trida findById(int id) {
        return tridaRepository.findById(id).orElse(null);
    }

    /**
     * Vrací počet studentů v dané třídě.
     * @param id Identifikátor třídy.
     * @return Počet studentů.
     */
    public int studentCountById(int id) {
        return studentRepository.countByTrida_Id(id);
    }
}
