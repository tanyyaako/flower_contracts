package viewModel;

import viewModel.Base.BaseView;

import java.util.List;

public record MainPageView(
        BaseCategory baseCategory,
        BaseView baseView,
        String bestseller,
        List<BestSellerView> bestSellerViews,
        String salesOfMonths,
        List<SalesOfMonthsView> salesOfMonthsViews

) {
}
