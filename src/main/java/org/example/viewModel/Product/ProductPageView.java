package org.example.viewModel.Product;

import org.example.viewModel.Base.BaseView;

import java.util.List;

public record ProductPageView(
        BaseView baseView,
        ProductView productView,
        String description,
        List<ProductView> productSameViews
) {
}
