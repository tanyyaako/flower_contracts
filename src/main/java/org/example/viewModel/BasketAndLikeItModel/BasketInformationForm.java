package org.example.viewModel.BasketAndLikeItModel;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class BasketInformationForm {
    @NotBlank(message = "address cannot be empty")
    String address;
    @NotBlank(message = "dateTime cannot be empty")
    LocalDateTime dateTime;
    @NotBlank(message = "fio cannot be empty")
    String fio;
    @NotBlank(message = "number cannot be empty")
    String number;

}
