package viewModel.User;

import jakarta.validation.constraints.NotBlank;

public class UserInputModel {
    @NotBlank(message = "Name cannot be empty")
    String login;

    @NotBlank(message = "Password cannot be empty")
    String password;
}
