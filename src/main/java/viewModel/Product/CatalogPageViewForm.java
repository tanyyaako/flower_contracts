package viewModel.Product;

import viewModel.Base.BaseView;
import viewModel.Category.CategoryView;

import java.util.List;

public record CatalogPageView(
        BaseView baseView,
        List<CategoryView> categoryView,
        List<ProductView> productViews,
        ProductSearchForm productSearchForm
) {
}
