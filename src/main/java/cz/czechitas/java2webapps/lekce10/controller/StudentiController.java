package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.StudentiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/studenti")
public class StudentiController {
    private final StudentiService studentiService;

    public StudentiController(StudentiService studentiService) {
        this.studentiService = studentiService;
    }

    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("studenti/index");
        modelAndView.addObject("studenti", studentiService.findAll());
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/studenti/detail");
        modelAndView.addObject("student", studentiService.findById(id));
        return modelAndView;
    }

}
