package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.UciteleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ucitele")
public class UciteleController {
    private final UciteleService uciteleService;

    public UciteleController(UciteleService uciteleService) {
        this.uciteleService = uciteleService;
    }
}
