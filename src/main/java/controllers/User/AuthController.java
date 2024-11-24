package controllers;

import viewModel.User.RegistrationInput;
import viewModel.User.UserInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("authentication")
public interface AuthController {

    @GetMapping("login")
    String login(
            @ModelAttribute("input") UserInputModel input,
            Model model
    );

    @GetMapping("registration")
    String registration(
            @ModelAttribute("input") RegistrationInput input,
            Model model
    );
}
