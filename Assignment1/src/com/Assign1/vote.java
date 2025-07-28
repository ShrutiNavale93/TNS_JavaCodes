package com.Assign1;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter age: ");
        int age = sc.nextInt(); 
        if (age >= 18) {
            System.out.println("Person is Eligible for voting");
        } else {
            System.out.println("Person is not eligible for voting");
        }

        sc.close();
    }
}
