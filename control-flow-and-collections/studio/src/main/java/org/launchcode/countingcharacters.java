package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class countingcharacters {
    public static void main(String[] args){
        HashMap<Character,Integer> arrHash=new HashMap<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=input.nextLine();
        char[] charArr=str.toCharArray();
        for (char item:charArr){
            if(arrHash.containsKey(item)){
                int val=arrHash.get(item);
                val=val+1;
                arrHash.put(item,val);

            }
            else {
                arrHash.put(item,1);
            }
        }
        for (Map.Entry<Character, Integer> eachChar : arrHash.entrySet()) {
            System.out.println(eachChar.getKey() + ": " + eachChar.getValue() );
        }

    }
}
