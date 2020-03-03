package com.ania;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink water");
        }
        else if (temp > 20) {
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("Cold day");
        };

        ////////////
        // najszybszy sposób, bez hardkodowania od razu przypisujemy mu false/true
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

        ///////////////// FIZZ BUZZ
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if(number % 5 == 0 && number % 3 == 0){
            System.out.println("BuzzFizz");
        }
        else if(number % 3 == 0){
            System.out.println("Buzz");
        }
        else if(number % 5 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(number);
        }

        ////////WHILE

        Scanner scanner1 = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner1.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

         /////// FRUIT LOOP
        String[]fruits = {"Apple", "Banana", "Orange", "Mango"};

        for (int i = 0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits){      //FOR EACH LOOP
            System.out.println(fruits);
        }


    }
}
