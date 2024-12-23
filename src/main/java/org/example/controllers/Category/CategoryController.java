package org.example.controllers.Category;

import jakarta.validation.Valid;
import org.example.controllers.Base.BaseController;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.example.viewModel.Category.CategoryCreateForm;
import org.example.viewModel.Category.CategoryEditForm;
import org.springframework.ui.Model;

import java.security.Principal;

@RequestMapping("/categories")
public interface CategoryController extends BaseController {

    @GetMapping("/listCategory")
    String listProducts(Principal principal, Model model);
    @GetMapping("/create")
    String createForm(Principal principal,Model model);

    @PostMapping("/create")
    String create(
            @Valid @ModelAttribute("form") CategoryCreateForm form,
            BindingResult bindingResult,Principal principal,
            Model model
    );

    @GetMapping("/{id}/edit")
    String editForm(
            @PathVariable Long id,Principal principal,
            Model model
    );

    @PostMapping("/{id}/edit")
    String edit(
            @PathVariable Long id,
            @Valid @ModelAttribute("form") CategoryEditForm form,
            BindingResult bindingResult,Principal principal,
            Model model
    );

}
