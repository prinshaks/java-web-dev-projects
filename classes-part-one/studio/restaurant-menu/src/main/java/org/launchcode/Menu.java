package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> MenuList = new ArrayList<>();
    private LocalDate Lastupdated;

    public ArrayList<MenuItem> getMenuList() {
        return MenuList;
    }

    public LocalDate getLastupdated() {
        return Lastupdated;
    }


    @Override
    public String toString(){
        StringBuilder appetizers = new StringBuilder();
        for(MenuItem itm : MenuList){
            if (itm.getCategory().equals("appetizer")){
                appetizers.append("\n").append(itm.toString()).append("\n");
            }
        }
        StringBuilder maincourse = new StringBuilder();
        for(MenuItem itm : MenuList){
            if (itm.getCategory().equals("main course")){
                maincourse.append("\n").append(itm.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for(MenuItem itm : MenuList){
            if (itm.getCategory().equals("desserts")){
                desserts.append("\n").append(itm.toString()).append("\n");
            }
        }
        return "\nToday's Menu\n" +
                "APPETIZERS:" + appetizers +"\n" +
                "MAIN COURSE:" + maincourse +"\n" +
                "DESSERTS:" + desserts +"\n" ;
    }

    void addItem(MenuItem newItem){
        String message = "Item already exists";
        if(MenuList.contains(newItem)){
            System.out.println(message);
            return;
        }
        for(MenuItem itm : MenuList){
            if(itm.equals(newItem)){
                System.out.println(message);
                return;
            }
        }
        MenuList.add(newItem);
        Lastupdated= LocalDate.now();
    }
    void removeItem(MenuItem item){
        MenuList.remove(item);
        Lastupdated= LocalDate.now();
    }
}
