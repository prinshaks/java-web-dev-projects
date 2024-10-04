package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> MenuList;
    private LocalDate Lastupdated;

    public ArrayList<MenuItem> getMenuList() {
        return MenuList;
    }

    public LocalDate getLastupdated() {
        return Lastupdated;
    }
}
