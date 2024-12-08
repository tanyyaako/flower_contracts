package org.example.viewModel.Product;

import java.util.List;

public class ProductView{
        Long id;
        String nameOfProduct;
        Double price;
        String url;
        Long categoryID;
        Double salePrice;

    public ProductView() {
    }

    public ProductView( Long id, String nameOfProduct, Double price, String url,Long categoryID,Double salePrice) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.url = url;
        this.categoryID = categoryID;
        this.salePrice = salePrice;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
}
