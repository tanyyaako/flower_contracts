package org.example.viewModel.Product;

import org.example.viewModel.Base.BaseView;

import java.util.List;

public record AdminSearchForm(
        List<Long> categoryViewIds,
        List<Long> productViewsIds,
        ProductSearchForm productSearchForm
) {
}
