package com.rhm.demo.contollers;
import com.rhm.demo.models.Dojo;
import com.rhm.demo.models.Ninja;
import com.rhm.demo.services.NinjaService;
import com.rhm.demo.services.DojoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
public class HomeController {

    private final DojoService dojoService;
    private final NinjaService ninjaService;
    public HomeController(DojoService dojoService, NinjaService ninjaService) {
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("dojos", this.dojoService.getAll() );

        return "home";
    }
    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {

        return "new";
    }


    @RequestMapping(value = "/dojos", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/dojos/new";
        } else {

            dojoService.createDojon(dojo);
            return "redirect:/";
        }
    }



    @RequestMapping("/ninjas/new")
    public String NewLicense( Model model, @ModelAttribute("ninja") Ninja ninja) {
        List<Dojo> dojo = dojoService.getAll();
        model.addAttribute("dojo", dojo );
        return "newNinja";
    }

    @RequestMapping(value = "/ninja", method = RequestMethod.POST)
    public String CreateNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()){ return "newNinja";}

        else {
            ninjaService.createNinja(ninja);
            return "redirect:/";
        }

    }

    @RequestMapping(value="/ninjas", method=RequestMethod.POST)
    public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("dojo", this.dojoService.getAll() );
            return "newNinja";
        }
        this.ninjaService.createNinja(ninja);
        return "redirect:/";
    }

    @RequestMapping("/dojos/{id}")
    public String Show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("dojo", this.dojoService.findById(id));
        return "/show";
    }
}





























