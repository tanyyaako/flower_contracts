package org.example.viewModel.Category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CategoryEditForm(
        @NotNull(message = "Id cannot be null")
        Long id,
        @NotBlank(message = "Name cannot be null")
        String name,
        String description
) {
}
