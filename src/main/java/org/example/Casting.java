package org.example;

public class Casting {

    public static void main(String[] args) {
//        Widening Casting
         int myInt = 9;
         double myDouble = myInt; //Automatically casting: int to double


        System.out.println(myInt);
        System.out.println(myDouble);

//        Narrowing Casting
        double myDoubleTwo = 9.78d;
        int myIntTwo = (int) myDoubleTwo; // Manually casting: double to int

        System.out.println(myDoubleTwo);
        System.out.println(myIntTwo);

        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);

        /*       + 	Addition 	Adds together two values 	x + y
                - 	Subtraction 	Subtracts one value from another 	x - y
                * 	Multiplication 	Multiplies two values 	x * y
                / 	Division 	Divides one value by another 	x / y
                % 	Modulus 	Returns the division remainder 	x % y
                ++ 	Increment 	Increases the value of a variable by 1 	++ x*/                -- 	Decrement 	Decreases the value of a variable by 1 	--x *

            /* = 	x = 5 	x = 5
                += 	x += 3 	x = x + 3
                -= 	x -= 3 	x = x - 3
                *= 	x *= 3 	x = x * 3
                /= 	x /= 3 	x = x / 3
                %= 	x %= 3 	x = x % 3
                &= 	x &= 3 	x = x & 3 Key Points
                                        & is the bitwise AND operator in Java.
                                         3 in binary is 00000011.
                                           The operation preserves only the last two bits of x, setting all others to 0.
                                            Result
                                            The new value of x will be its original value masked to keep only the last 2 bits.
                                            x = x & 0b00000011; // Retains only bits
                |= 	x |= 3 	x = x | 3 You are solving for the values of \(x\) that satisfy the absolute value equation \(|x|=3\).
                ^= 	x ^= 3 	x = x ^ 3
                >>= 	x >>= 3 	x = x >> 3  The expression x >>= 3 is a compound assignment operator that combines a bitwise right shift with an assignment. It is equivalent to x = x >> 3.
                <<= 	x <<= 3 	x = x << 3  	The expression x <<= 3 in programming represents a left bit shift assignment.*/

//        Characters in Strings
        String String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));//Outputs 7
    }
}
