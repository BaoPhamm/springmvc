package com.pamb.springmvc.web;

import com.pamb.springmvc.entity.Spitter;
import com.pamb.springmvc.repository.SpitterRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private final SpitterRepository spitterRepository;

    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        return "registerForm";
    }

    @PostMapping(value = "/register")
    public String processRegistration(@Valid @ModelAttribute Spitter spitter, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registerForm";
        }
        spitterRepository.save(spitter);
        System.out.println(spitter.getUsername());
        return "redirect:/servlet1/spitter/" + spitter.getUsername();
    }

    @GetMapping("/{username}")
    public String showSpitterProfile(
            @PathVariable String username, Model model) {
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }
}
