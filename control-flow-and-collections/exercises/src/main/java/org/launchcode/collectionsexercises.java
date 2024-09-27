package org.launchcode;

import java.util.*;

public class collectionsexercises {
    public static void main(String[] args){
        int[] arr1={1, 1, 2, 3, 5, 8};
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2!=0) {
                System.out.println(arr1[i]);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));


        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(3);

        System.out.println("Total of even numbers in list: " + sumEven(numbers));

        ArrayList<String> wordsss = new ArrayList<String>();
        wordsss.add("Apple");
        wordsss.add("Mango");
        wordsss.add("Orange");
        wordsss.add("Grapes");
        wordsss.add("Watermelon");
        wordsss.add("jackfruit");

        printFive(wordsss,5);


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        ArrayList<String> phraseArrList = new ArrayList<>(Arrays.asList(words));
        printFive(phraseArrList,numChars);

        String newStudent ;
        HashMap<Integer,String> classRoster=new HashMap<>();
        input=new Scanner(System.in);
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void printFive(ArrayList<String> arr, int num) {
        for (String word : arr) {
            if (word.length() == num) {
                System.out.println(word);
            }
        }
    }

}
