package org.example.viewModel.Product;

import jakarta.validation.constraints.Min;
import org.example.viewModel.Category.CategoryView;

import java.util.List;

public class ProductSearchForm{
        String searchProduct;
        Integer page;
        Integer size;
        Double fromPrice;
        Double toPrice;
        List<CategoryView> categoryViews;

        public ProductSearchForm(List<CategoryView> categoryViews, Double fromPrice, Integer page, String searchProduct, Integer size, Double toPrice) {
                this.categoryViews = categoryViews;
                this.fromPrice = fromPrice;
                this.page = page;
                this.searchProduct = searchProduct;
                this.size = size;
                this.toPrice = toPrice;
        }

        public ProductSearchForm() {
        }

        public List<CategoryView> getCategoryViews() {
                return categoryViews;
        }

        public void setCategoryViews(List<CategoryView> categoryViews) {
                this.categoryViews = categoryViews;
        }

        @Min(value = 1, message = "Цена должна быть больше 0")
        public  Double getFromPrice() {
                return fromPrice;
        }

        public void setFromPrice( Double fromPrice) {
                this.fromPrice = fromPrice;
        }

        @Min(value = 0, message = "Страница должна быть больше 0")
        public  Integer getPage() {
                return page;
        }

        public void setPage( Integer page) {
                this.page = page;
        }

        public String getSearchProduct() {
                return searchProduct;
        }

        public void setSearchProduct(String searchProduct) {
                this.searchProduct = searchProduct;
        }

        @Min(value = 1, message = "Размер страницы должен быть больше 0")
        public  Integer getSize() {
                return size;
        }

        public void setSize( Integer size) {
                this.size = size;
        }

        @Min(value = 1, message = "Цена должна быть больше 0")
        public  Double getToPrice() {
                return toPrice;
        }

        public void setToPrice( Double toPrice) {
                this.toPrice = toPrice;
        }
}
