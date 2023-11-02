package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Set a value using the setter
        obj.setName("Rakesh Purohit");

        // Access the value using the getter and print it
        String retrievedName = obj.getName();
        System.out.println("Name: " + retrievedName);
    }
}