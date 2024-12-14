package org.example.viewModel.Category;

import org.example.viewModel.Product.ProductView;

import java.util.List;

public class CategoryView{
        Long id;
        String name;
        String description;
        List<Long> productsIds;
        String type;

    public CategoryView() {
    }

    public CategoryView( Long id, String name,String description, List<Long> products,String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productsIds = productsIds;
        this.type = type;
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

    public List<Long> getProducts() {
        return productsIds;
    }

    public void setProducts(List<Long> products) {
        this.productsIds = productsIds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
