package com.example.ordernow;

public class update_product {

    String ProductName;
    String ProductPrice;
    String ProductStock;
    String Image;
    String ProductCategory;

    public update_product() {
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductStock() {
        return ProductStock;
    }

    public void setProductStock(String productStock) {
        ProductStock = productStock;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    public update_product(String productName, String productPrice, String productStock, String image, String productCategory) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductStock = productStock;
        Image = image;
        ProductCategory = productCategory;
    }


}
