package org.example.viewModel.Category;

import org.example.viewModel.Product.ProductView;

import java.util.List;

public class CategoryView{
        Long id;
        String name;
        String description;
        List<ProductView> products;

    public CategoryView() {
    }

    public CategoryView( Long id, String name,String description, List<ProductView> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductView> getProducts() {
        return products;
    }

    public void setProducts(List<ProductView> products) {
        this.products = products;
    }
}
