package org.example.controllers.Sales;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sales")
public interface SalesOfMonthController {

    @GetMapping
    String listBestSellers(Model model);
}
