package org.example.viewModel.BestSellerModel;

import org.example.viewModel.Base.BaseView;
import org.example.viewModel.Product.ProductView;

public record BestSellerView(
        ProductView productView,
        BaseView baseView
) {
}
