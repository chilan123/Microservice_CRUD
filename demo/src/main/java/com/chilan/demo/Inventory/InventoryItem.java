package com.chilan.demo.Inventory;

import jakarta.persistence.*;

@Entity
@Table
public class InventoryItem {
    @Id
    @SequenceGenerator(
            name ="inventory_sequence",
            sequenceName ="inventory_sequence",
            allocationSize = 1

    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="inventory_sequence"
    )
    private Long id;
    private String name;
    private String description;
    private String category;
    private double price;
    private int stockLevel;

    public InventoryItem() {

    }




    public InventoryItem(Long id,
                         String name,
                         String description,
                         String category,
                         double price,
                         int stockLevel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.stockLevel = stockLevel;
    }


    public InventoryItem(String name,
                         String description,
                         String category,
                         double price,
                         int stockLevel) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.stockLevel = stockLevel;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }


}
