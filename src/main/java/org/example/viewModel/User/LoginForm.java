package org.example.viewModel.User;

import jakarta.validation.constraints.NotBlank;

public class LoginForm {
    @NotBlank(message = "Name cannot be empty")
    String login;

    @NotBlank(message = "Password cannot be empty")
    String password;
}
