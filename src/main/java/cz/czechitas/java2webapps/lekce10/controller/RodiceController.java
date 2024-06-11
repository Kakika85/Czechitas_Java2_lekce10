package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.RodiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rodice")
public class RodiceController {
    private final RodiceService rodiceService;

    public RodiceController(RodiceService rodiceService) {
        this.rodiceService = rodiceService;
    }
}
