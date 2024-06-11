package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.TridyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tridy")
public class TridyController {

    private final TridyService tridyService;

    public TridyController(TridyService tridyService) {
        this.tridyService = tridyService;
    }

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/tridy/index");
        modelAndView.addObject("tridy", tridyService.findAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/tridy/detail");
        modelAndView.addObject("trida", tridyService.findById(id));
        modelAndView.addObject("pocetStudentu", tridyService.studentCountById(id));
        return modelAndView;
    }
}
