package org.example.controllers.Home;

import org.example.controllers.Base.BaseController;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RequestMapping("/")
public interface HomeController extends BaseController {

    @GetMapping("/home")
    String homePage(Principal principal, Model model);
}
