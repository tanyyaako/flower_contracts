package input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public class ProductCreateInputModel {
    @NotBlank(message = "Name cannot be null")
    String name;

    @NotNull(message = "Price cannot be null")
    Double price;

    String url;

    @NotNull(message = "Category cannot be null")
    String category;
}
