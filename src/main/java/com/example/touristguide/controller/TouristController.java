package com.example.touristguide.controller;

import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.repository.TouristRepository;
import com.example.touristguide.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("attractions")
public class TouristController {

    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping
    public String landingPage(Model model){
        model.addAttribute("touristAttractionList", touristService.getTouristAttractions());
        return "landingPage";
    }

    @GetMapping("/add")
    public String showAddAttractionForm(Model model) {
        model.addAttribute("attraction", new TouristAttraction());
        return "addAttractionForm";
    }

    @PostMapping("/save")
    public String saveAttraction(@ModelAttribute("attraction") TouristAttraction attraction) {
        touristService.addTouristAttraction(attraction);
        return "redirect:/attractions"; // Redirect to landing page after saving
    }
}