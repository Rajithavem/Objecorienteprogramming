package org.example;

//Encapsulation

public class Student {

    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public static void main(String[]args){
        Student Abhi = new Student("Abhiram",25,"23 East,California");

        System.out.println(Abhi.getName());
        System.out.println(Abhi.getAge());
        System.out.println(Abhi.getAddress());
    }




}

