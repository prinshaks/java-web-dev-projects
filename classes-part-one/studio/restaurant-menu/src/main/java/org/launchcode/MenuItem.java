package org.launchcode;

import javax.lang.model.element.Name;
import java.time.LocalDate;

public class MenuItem {
    private String Name;
    private String Description;
    private double Price;
    private LocalDate Dateadded;
    private String Category;

    public MenuItem(String name, String description, double price, LocalDate dateadded, String category) {
        Name = name;
        Description = description;
        Price = price;
        Dateadded = dateadded;
        Category = category;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public LocalDate getDateadded() {
        return Dateadded;
    }

    public String getCategory() {
        return Category;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setDateadded(LocalDate dateadded) {
        Dateadded = dateadded;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
