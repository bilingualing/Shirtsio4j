package com.shirts.io.Products;


import java.util.List;

public class Product
{
    public List<Category> categories;
    public int product_number;
    public String name;
    public String brand;
    public String description;
    public String materials;
    public String comments;
    public int style_id;
    public int has_sleeves;
    public List<String> pictures;
    public List<Color> colors;

    public Product()
    {
        super();
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public int getProduct_number() {
        return product_number;
    }

    public void setProduct_number(int product_number) {
        this.product_number = product_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getStyle_id() {
        return style_id;
    }

    public void setStyle_id(int style_id) {
        this.style_id = style_id;
    }

    public int getHas_sleeves() {
        return has_sleeves;
    }

    public void setHas_sleeves(int has_sleeves) {
        this.has_sleeves = has_sleeves;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }
}
