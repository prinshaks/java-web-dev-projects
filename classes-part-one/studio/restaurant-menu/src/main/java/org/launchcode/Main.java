package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem item1 = new MenuItem("Fried Rice","Fried rice with veggies",22,"main course");
        MenuItem item2 = new MenuItem("Spinach Artichoke","spinach and Artichoke dip with flat bread",9,"appetizer");
        MenuItem item3 = new MenuItem("ice cream","vanilla ice cream",5,"desserts");
        MenuItem item4 = new MenuItem("Boneless chicken wings","Chicken wings fried",12,"appetizer");
        MenuItem item5 = new MenuItem("Chicken noodles","Rice noodles with chicken",13,"main course");

        System.out.println(item1);

        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        menu.removeItem(item4);

        System.out.println(menu);

        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Chicken noodles","Rice noodles with chicken",13,"main course");

        System.out.println(item5.equals(item6));

        menu.addItem(item5);

        System.out.println(menu);

    }
}
