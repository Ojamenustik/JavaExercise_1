package com.ania;

class Robot{
    public void speak(String text){
        System.out.println(text);
    }

    public void jump(int height){
        System.out.println("Jumping: "+height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving "+ distance + " meters in direction " + direction);
    }

}

public class exercise2 {

    public static void main(String [] args){

        Robot sam = new Robot();

        sam.speak("Hi, my name is Sam.");
        sam.jump(8);
        sam.move("West", 12.5);

        String greeting = "Hello there <3";

        sam.speak(greeting);
    }
}
