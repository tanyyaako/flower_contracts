package org.example.viewModel.Product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.example.controllers.LikeIt.LikeItController;

import java.util.List;

public class ProductCreateForm {
        String name;
        Double price;
        String url;
        Long categoryID;
        String description;
        Double salePrice;
        Double quantityProduct;

        @NotNull(message = "Category cannot be null")
        public  Long getCategoryID() {
                return categoryID;
        }

        public void setCategoryID( Long categoryID) {
                this.categoryID = categoryID;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        @NotBlank(message = "Name cannot be null")
        public  String getName() {
                return name;
        }

        public void setName( String name) {
                this.name = name;
        }

        @NotNull(message = "Price cannot be null")
        @Min(value = 1, message = "Цена должна быть больше 0")
        public  Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        @NotNull(message = "Quantity cannot be null")
        @Min(value = 0, message = "Количество должна быть больше 0")
        public Double getQuantityProduct() {
                return quantityProduct;
        }

        public void setQuantityProduct(Double quantityProduct) {
                this.quantityProduct = quantityProduct;
        }

        public Double getSalePrice() {
                return salePrice;
        }

        public void setSalePrice(Double salePrice) {
                this.salePrice = salePrice;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }
}
