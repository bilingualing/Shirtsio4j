package com.shirts.io.Products;


public class Category
{

    public int category_id;
    public String name;

    public Category()
    {
        super();
    }

    public int getCategoryId() {
        return category_id;
    }

    public void setCategoryId(int categoryId) {
        this.category_id = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
