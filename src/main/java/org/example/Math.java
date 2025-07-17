package org.example;

public class Math {
    public static void main(String[] args) {
        
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));//The Math.abs(x) method returns the absolute (positive) value of x:
        Math.random();//Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

        /*
        To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:
         */
        int randomNum = (int)(Math.random() * 101); // 0 to 100

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

    }


}
