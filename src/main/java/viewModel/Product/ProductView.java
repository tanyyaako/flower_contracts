package viewModel;

public record ProductView(
        Long id,
        String nameOfProduct,
        Double price,
        String url,
        String category
) {
}
