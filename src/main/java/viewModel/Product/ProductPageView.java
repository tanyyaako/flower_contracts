package viewModel;

import viewModel.Base.BaseView;

import java.util.List;

public record ProductPageView(
        BaseView baseView,
        String url,
        String name,
        String price,
        String description,
        String buttonLikeIt,
        String buttonToBasket,
        String ProductSameCategory,
        List<ProductView> productViews
) {
}
