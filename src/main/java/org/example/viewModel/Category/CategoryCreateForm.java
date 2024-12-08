package org.example.viewModel.Category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CategoryCreateForm (
        @NotBlank(message = "Name cannot be null")
        String name
){
}
