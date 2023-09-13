package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String n, double p, String d, String c, boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ".\nMenu Item: " + this.name + ".\nPrice: " + this.price + ".\nDescription: " + this.description + ".\nCategory: " + this.category + ".\nNew? " + this.isNew;
    }


    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        MenuItem menuItem = (MenuItem) toBeCompared;
        return menuItem.getPrice() == getPrice();
    }
}

