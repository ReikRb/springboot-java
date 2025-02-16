package org.example;

public class Classes {
    String name;
    int age;

    public Classes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Edad: " + age);
    }

    public static void main(String[] args) {
        Classes user = new Classes("Reik", 20);
        user.showInfo();
    }
    
}
