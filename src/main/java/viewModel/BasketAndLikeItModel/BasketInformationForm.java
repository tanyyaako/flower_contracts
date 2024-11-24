package input;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class BasketInformationInput {
    @NotBlank(message = "address cannot be empty")
    String address;
    @NotBlank(message = "dateTime cannot be empty")
    LocalDateTime dateTime;
    @NotBlank(message = "fio cannot be empty")
    String fio;
    @NotBlank(message = "number cannot be empty")
    String number;

}
