package org.example.viewModel.BasketAndLikeItModel;

import org.example.viewModel.Product.ProductView;

import java.util.List;

public record BasketContentView(
        List<ProductView> productViews,
        Double totalPrice
) {
}
