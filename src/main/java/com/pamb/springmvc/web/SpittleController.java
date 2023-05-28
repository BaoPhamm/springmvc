package com.pamb.springmvc.web;

import com.pamb.springmvc.repository.SpittleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private final SpittleRepository spittleRepository;

    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @GetMapping
    public String spittles(Model model) {
        model.addAttribute("spittleList",
                spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

    @GetMapping("/show")
    public String showSpittle(@RequestParam(value = "spittle_id", required = false, defaultValue = "1") Long spittleId, Model model) {
        model.addAttribute("spittle", spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
