package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("products")
public interface ProductController {

    @GetMapping("/{id}")
    String clickProductPage(
            @PathVariable("id") Long id
    );

    @GetMapping
    String mainPage();

    @GetMapping("search")
    String search(
            @ModelAttribute("filter") FilterProductInput filter,
            Model model
    );
}
