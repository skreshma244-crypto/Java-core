package com.student.training;

//Student.java
public class Student {
 // Fields (attributes)
 private int id;
 private String name;
 private int age;

 // Constructor
 public Student(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 // Getters
 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Setters
 public void setId(int id) {
     this.id = id;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }

 // Method to display student details
 public void displayStudent() {
     System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
 }

 // Main method to test
 public static void main(String[] args) {
     Student s1 = new Student(101, "Reshma", 22);
     Student s2 = new Student(102, "Rahul", 21);

     s1.displayStudent();
     s2.displayStudent();
 }
}
