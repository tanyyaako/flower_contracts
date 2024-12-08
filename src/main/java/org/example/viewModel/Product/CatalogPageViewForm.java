package org.example.viewModel.Product;

import org.example.viewModel.Base.BaseView;
import org.example.viewModel.Category.CategoryView;

import java.util.List;

public record CatalogPageViewForm(
        BaseView baseView,
        List<CategoryView> categoryView,
        List<ProductView> productViews,
        ProductSearchForm productSearchForm
) {
}
