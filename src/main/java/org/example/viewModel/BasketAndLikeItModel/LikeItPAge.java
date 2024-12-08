package org.example.viewModel.BasketAndLikeItModel;

import org.example.viewModel.Product.ProductView;
import org.example.viewModel.Base.BaseView;

import java.util.List;

public record LikeItPAge(
        BaseView baseView,
        List<ProductView> productViews
) {
}
