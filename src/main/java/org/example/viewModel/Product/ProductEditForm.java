package org.example.viewModel.Product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class ProductEditForm{
        Long id;
        String name;
        Double price;
        String url;
        Long categoryID;
        Double sale;

        public ProductEditForm() {
        }

        public ProductEditForm( Long id, String name, Double price, String url,Long categoryID,Double sale) {
                this.id = id;
                this.name = name;
                this.price = price;
                this.url = url;
                this.categoryID = categoryID;
                this. sale=sale;
        }

        public Long getCategoryID() {
                return categoryID;
        }

        public void setCategoryID(Long categoryID) {
                this.categoryID = categoryID;
        }

//        @NotNull(message = "Id cannot be null")
        public  Long getId() {
                return id;
        }

        public void setId( Long id) {
                this.id = id;
        }

        @NotBlank(message = "Name cannot be null")
        public  String getName() {
                return name;
        }

        public void setName( String name) {
                this.name = name;
        }

        @Min(value = 1, message = "Price cannot be null")
        public Double getPrice() {
                return price;
        }

        public void setPrice( Double price) {
                this.price = price;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public Double getSale() {
                return sale;
        }

        public void setSale(Double sale) {
                this.sale = sale;
        }
}
