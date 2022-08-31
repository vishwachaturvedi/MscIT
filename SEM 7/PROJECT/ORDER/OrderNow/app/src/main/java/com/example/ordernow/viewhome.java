package com.example.ordernow;

public class viewhome {
    String ProductName;
    String ProductPrice;
    String ProductStock;
    String Image;

    public viewhome() {
    }

    public viewhome(String productName, String productPrice, String productStock, String image) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductStock = productStock;
        Image = image;
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
}
