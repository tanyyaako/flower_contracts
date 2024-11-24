package viewModel.User;

import jakarta.validation.constraints.NotBlank;

public class RegistrationInput {
    @NotBlank(message = "Name cannot be empty")
    String login;

    @NotBlank(message = "Password cannot be empty")
    String password;

    @NotBlank(message = "fio cannot be empty")
    String fio;

    @NotBlank(message = "email cannot be empty")
    String email;


}
