package org.example;

public class SoccerPlayer {

    String name;
    int age;
    String address;

    public SoccerPlayer(String name, int age, String address){
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
        SoccerPlayer Abhi = new SoccerPlayer("Abhi",25,"23 East,California");

        System.out.println(Abhi.getName());
        System.out.println(Abhi.getAge());
        System.out.println(Abhi.getAddress());
    }

    


}

