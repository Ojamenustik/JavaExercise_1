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

        //STRINGBUILDER

        StringBuilder sb = new StringBuilder();
        sb.append("Hi, my name is Sue. ");
        sb.append("I'm not so cool. ");
        sb.append("I like frogs and robots. ");

        sb.append("\n")
                .append("And who are you? ")
                .append("You like frogs?");

        System.out.println(sb.toString());

        /////Formating

        System.out.printf("Total cost: %d; Quantity is %d", 5,120);

        for(int i = 0; i <=20; i++){
            System.out.printf("%2d: %s\n", i, "some text");
        }

        System.out.printf("Total value: %.2f\n", 5.5678);
        System.out.printf("Total value: %8.2f\n", 343.2578);


    }
}
