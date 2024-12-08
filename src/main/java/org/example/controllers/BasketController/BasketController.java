package org.example.controllers.BasketController;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.example.viewModel.BasketAndLikeItModel.BasketInformationForm;

@RequestMapping("/basket")
public interface BasketController {

    @GetMapping
    String showBasket(Model model);

    @GetMapping("/information")
    String informationForm(Model model);

    @PostMapping("/information")
    String informationForm(
            @Valid @ModelAttribute("form") BasketInformationForm form,
            BindingResult bindingResult,
            Model model
    );

    @PostMapping("/add")
    String addToBasket(@RequestParam Long id);

    @PostMapping("/remove")
    String removeFromBasket(@RequestParam Long id);
}

