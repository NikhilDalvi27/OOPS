package basics;

import encapsulation.Encapsulation;

public class MainClass {
    public static void main(String[] args) {

        Person p2 = new Person(31,"Rocky");   //Constructor call will return an Object

        System.out.println(p2.age+" "+p2.name);

        p2.walk();
        p2.walk(3); //Polymorphism

        System.out.println(Person.count);   //Class Property and not an Object Property

        Developer d1 = new Developer(24,"Nikhil");
        d1.walk();


        Encapsulation obj = new Encapsulation();
        obj.doWork();

    }


}

class Developer extends Person{

    Developer(int age, String name) {
        super(age, name);       //It calls the Constructor of Parent Class

    }
    void walk(){    //  Runtime Polymorphism
        System.out.println("basics.Developer "+ name +" is walking");
    }
}

class  Person{
    protected String name;    //For Encapsulation (Data Hiding)
    int age;
    static int count;   //Property of class bcoz of static

//    basics.Person(){
//        count++;
//        System.out.println("Creating an Object");
//    }

    Person(int age,String name){
//        this();     //It is used to call one constructor from Other
        this.name=name;   //this.name mean the name variable of this class
        this.age=age;
    }

    void walk(){    //behaviour
        System.out.println(name +" is walking");
    }

    void eat(){
        System.out.println(name +" is eating");
    }

    void walk(int steps){       //Polymorphism
        System.out.println(name +" walked "+steps +" step");
    }
}