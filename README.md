# InvertedTriangle
In this program, the user is prompted to enter the number of digits. The program then uses nested for loops to draw the inverted triangle pattern.
The outer loop i controls the number of rows in the triangle. It starts from numDigits and goes down to 1. Each iteration of the outer loop represents a row in the triangle.

The first inner loop j prints the required number of spaces before the asterisks. The number of spaces is determined by numDigits - i.

The second inner loop k prints the asterisks. The number of asterisks in each row is 2 * i - 1. It starts from 1 and goes up to 2 * i - 1.

After printing the required spaces and asterisks in each row, the program moves to the next line using System.out.println().

The result is an inverted triangle pattern formed by asterisks on the console.
