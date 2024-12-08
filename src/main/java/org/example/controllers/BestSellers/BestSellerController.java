package org.example.controllers.BestSellers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/bestSeller")
public interface BestSellerController {

    @GetMapping
    String listBestSellers(Model model);
}
