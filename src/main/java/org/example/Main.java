package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner and min and max variable
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean isFirst = true;

        while(true){
            System.out.println("Enter a number : ");
            boolean isValid = scanner.hasNextInt();
            if(isValid){
                int num = scanner.nextInt();
                scanner.nextLine();
                if(isFirst){
                    min = num;
                    max = num;
                    isFirst = false;
                }

                if(num < min){
                    min = num;
                } else if(num > max){
                    max = num;
                }
            }else{
                System.out.println("Invalid Value");
                break;
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

        scanner.close();
    }
}