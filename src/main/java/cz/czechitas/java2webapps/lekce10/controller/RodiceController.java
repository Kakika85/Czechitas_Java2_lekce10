package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.RodiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rodice")
public class RodiceController {
    private final RodiceService rodiceService;

    public RodiceController(RodiceService rodiceService) {
        this.rodiceService = rodiceService;
    }
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("rodice/index");
        modelAndView.addObject("rodice", rodiceService.findAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/rodice/detail");
        modelAndView.addObject("rodic", rodiceService.findById(id));
        return modelAndView;
    }
}
