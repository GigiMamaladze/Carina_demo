package com.qaprosoft.carina.demo.api.dummyjson.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private final int id;
    private final String title;
    private final String description;
    private final String price;
    private final String rating;
    private final String stock;
    private final String brand;
    private final String category;
    private final String images;
    private final String thumbnail;

    @JsonCreator
    public Product(@JsonProperty("id") int id, @JsonProperty("title") String title, @JsonProperty("description") String description, @JsonProperty("price") String price,
                   @JsonProperty("rating") String rating, @JsonProperty("stock") String stock, @JsonProperty("brand") String brand, @JsonProperty("category") String category,
                   @JsonProperty("images") String images, @JsonProperty("thumbnail") String thumbnail) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
        this.brand = brand;
        this.category = category;
        this.images = images;
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }


    public String getRating() {
        return rating;
    }

    public String getStock() {
        return stock;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getImages() {
        return images;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}

