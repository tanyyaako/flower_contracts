package controllers;

import viewModel.Product.ProductCreateForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/categories")
public interface CategoryController {

    @GetMapping(path = "create")
    String create(
            @ModelAttribute("inputModel") ProductCreateForm inputModel,
            Model model
    );
}
