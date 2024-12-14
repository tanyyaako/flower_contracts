package org.example.viewModel.Product;

import org.example.viewModel.Base.BaseView;
import org.example.viewModel.Category.CategoryView;

import java.util.List;

public record CatalogPageViewForm(
        BaseView baseView,
        List<Long> categoryViewIds,
        List<Long> productViewsIds,
        ProductSearchForm productSearchForm,
        String categoryType
) {
}
