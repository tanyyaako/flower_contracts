package org.example.controllers.Product;

import jakarta.validation.Valid;
import org.example.controllers.Base.BaseController;
import org.example.viewModel.Category.CategoryView;
import org.example.viewModel.Product.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RequestMapping("/products")
public interface ProductController extends BaseController {

    @GetMapping("/catalog")
    String catalog(
            @RequestParam(required = false) String categoryType,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            Principal principal,
            Model model
    );
    @PostMapping("/catalog")
    String catalog(
            @ModelAttribute("form") CatalogPageViewForm form,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            Principal principal,
                          Model model
    );

    @GetMapping("/{id}/details")
    String detailsProduct(
            @PathVariable("id") Long id,
            @ModelAttribute("form") CatalogPageViewForm form,
            Principal principal,
            Model model
    );
    @GetMapping("/list")
    String listProducts(Model model,Principal principal, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size);
    @PostMapping("/list")
    String listProducts(Model model,Principal principal,
                        @ModelAttribute("form") AdminSearchForm form,
                        @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
                        @RequestParam(value = "clearForm", required = false) String clearForm);

    @GetMapping("/create")
    String createForm(Principal principal,Model model);

    @PostMapping("/create")
    String create(
            @Valid @ModelAttribute("form") ProductCreateForm form,
            BindingResult bindingResult,
            Principal principal,
            Model model
    );

    @GetMapping("/{id}/edit")
    String editForm(
            @PathVariable Long id,
            Principal principal,
            Model model
    );

    @PostMapping("/{id}/edit")
    String edit(
            @PathVariable Long id,
            @Valid @ModelAttribute("form") ProductEditForm form,
            BindingResult bindingResult,
            Principal principal,
            Model model
    );

    @GetMapping("/{id}/delete")
    String delete(@PathVariable Long id,Principal principal);
}
