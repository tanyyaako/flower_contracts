package org.example.controllers.User;

import org.example.controllers.Base.BaseController;
import org.example.viewModel.User.RegistrationForm;
import org.example.viewModel.User.LoginForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/authentication")
public interface AuthController extends BaseController {

    @GetMapping("login")
    String login(
            @ModelAttribute("form") LoginForm form,
            Model model
    );

    @GetMapping("registration")
    String registration(
            @ModelAttribute("form") RegistrationForm form,
            Model model
    );
}
