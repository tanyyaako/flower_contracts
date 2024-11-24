package viewModel;

import java.util.List;

public record BasketContentView(
        List<String > name,
        List<Double> price,
        Double totalPrice
) {
}
