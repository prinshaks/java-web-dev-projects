package org.launchcode;

import javax.lang.model.element.Name;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String Name;
    private String Description;
    private double Price;
    private LocalDate Dateadded;
    private String Category;

    public MenuItem(String name, String description, double price, String category) {
        Name = name;
        Description = description;
        Price = price;
        Dateadded = LocalDate.now();
        //Dateadded = LocalDate.parse("2020-10-10");
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


    public void setCategory(String category) {
        Category = category;
    }
    Boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysnum = getDateadded().until(today, ChronoUnit.DAYS);
        return daysnum < 90;
    }

    @Override
    public String toString(){
        return getName() +"-" + (isNew() ? "-New!":"") + " | " + getDescription() + " | $" + getPrice() + " | " + getCategory();
    }

    @Override
    public boolean equals(Object tobeCompared){
        if(this == tobeCompared){
            return true;
        }
        if(tobeCompared==null){
            return false;
        }
        if(getClass() != tobeCompared.getClass()){
            return false;
        }
        MenuItem otherItem = (MenuItem)tobeCompared;
        return this.Name.equals(otherItem.getName());
    }
}
