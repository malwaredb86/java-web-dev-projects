package org.launchcode;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    private ArrayList<MenuItem> menuItem = new ArrayList<>();
    private Date date;

    public Menu(ArrayList<MenuItem> menuItem, Date date) {
        this.menuItem = menuItem;
        this.date = date;
    }

    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

