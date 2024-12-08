package org.example.viewModel.SalesOfMonth;

import org.example.viewModel.Base.BaseView;
import org.example.viewModel.Product.ProductView;

public record SalesOfMonthsView(
        BaseView baseView,
        ProductView productView
) {
}
