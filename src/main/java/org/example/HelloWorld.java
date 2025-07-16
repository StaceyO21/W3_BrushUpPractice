package org.example;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Brushing up on my basic java skills.");
        System.out.print("Hello, World! ");
        System.out.print("This should print on the same line.");

//        Printing out numbers
        System.out.println(3);
        System.out.println(5000);
//        Perform math equations
        System.out.println(3 + 3);
        System.out.println(3 * 3);
        System.out.println(3 / 3);
        System.out.println(3 % 2);
        System.out.println(64 % 5);

        String name = "John";
        System.out.println(name);

        int myNum = 25;
        System.out.println(myNum);

        int yourNum = 15;
        yourNum = 25;
        System.out.println(yourNum);

        final int firstNum = 15;
//        firstNum = 25; the final makes it unable to be overwritten
        System.out.println(firstNum);

        int num = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String


        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println(firstName + lastName);
        System.out.println(firstName + " " + lastName);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        int q, r, z;
        q = r = z = 50;
        System.out.println(q + r + z);

        int length = 4;
        int width = 6;
        int area;

        area = length * width;

        System.out.println("length is: " + length);
        System.out.println("width is: " + width);
        System.out.println("area is: " + area);

/*    byte 	Stores whole numbers from -128 to 127
short 	Stores whole numbers from -32,768 to 32,767
int 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double 	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean 	Stores true or false values
char 	Stores a single character/letter or ASCII values
 */

    }
}
