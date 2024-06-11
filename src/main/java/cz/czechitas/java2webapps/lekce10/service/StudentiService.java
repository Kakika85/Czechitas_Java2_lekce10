package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentiService {
    private final StudentRepository studentRepository;

    public StudentiService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
