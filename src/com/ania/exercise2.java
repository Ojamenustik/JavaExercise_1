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

class Frog{
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Machine{

    private int code;
    private String name;
    public Machine(){
        System.out.println("Constructor running!");
    }

    public Machine(String name){
        System.out.println("Constructor 2 running!");
        this.name = name;
    }

    public Machine(String name, int code){
        System.out.println("Constructor 3 running!");
        this.name = name;
        this.code = code;
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

        ///////Frog
        Frog froggy = new Frog();

        froggy.setName("Bertie");
        froggy.setAge(1);

        System.out.println(froggy.getName());

        ///Machine

        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Foxy", 344);
    }
}
