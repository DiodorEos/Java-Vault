# 🔖 CHAPTER 4 - Methods #

## 👁️‍🗨️ Overview ##
The fourth chapter covers everything about methods:
<br />
<br />
☑️ Structure and Definition <br />
☑️ Call Stack <br />
☑️ Pass by Value <br />
☑️ Variable Scope (locality) <br />
☑️ Method Overloading <br />
☑️ Recursion <br />

## 🏋️‍♂️ Exercises ##
In this chapter we will find just a small amount of theory-based tasks, some multiple choice questions and many practical exercises.
<br />
### 🗒️ Theory Questions ###
Here are a couple of questions and answers to establish some stable, theoretical ground for this chapter:
<br />
<details>
  <summary>
    ❓: No. 2: What does the word <code>static</code>, that we can see at the headers of some methods, mean?  
  </summary>
  <br /> 
  📇: The word static means that the method belongs to a class, but not to its objects. A static method can exist even if there is no object that belongs to that class! Importantly, the main() method is called by the JVM even before any object of the program's class is created. Thus, the main() method should always be static.
  <br /> 
</details>
<details>
  <summary>
   ❓: No. 10: Can we overload the <code>main()</code> method? If so, provide an example. 
  </summary>
  <br /> 
  📇: It is possible to overload the main() method, like any other method. By changing the arguments and creating a method like:
  
```java
public static void main(int x, int y) { System.out.println(x + y); }
```
We call, for example, main(6, 3) from within the main(String[] args) without any issue.
<br /> 
</details>


### 🖥️ Practical Exercises ###
🔷 **No. 14**: Display the sum of two numbers, rounded to two decimal places. Implement two methods: `sum()` and `roundNum()`. <br />

🔷 **No. 15**: Create two methods, `max()` and `min()`, that compute the maximum and minimum of three inputted numbers. <br />

🔷 **No. 16**: Create an `isEven()` method that determines whether an inputted number is even or odd. <br />

🔷 **No. 17**: Write a method that displays all single-digit and double-digit prime numbers. <br />

🔷 **No. 18**: Display the student's grade (AA - F) based on an inputted numerical score (0 - 100). Use a `setGrade()` method. <br />

🔷 **No. 19**: Check whether three inputted integers can form a valid triangle. If they do, determine whether it is a right triangle. Implement two methods: `isTriangle()` and `isRect()`. <br />

🔷 **No. 20**: Print an N × N square using asterisks (*), where N is an inputted integer. Use a method to achieve this. <br />

🔷 **No. 21**: Display a menu with conversion options between Fahrenheit and Celsius:

```
1. Fahrenheit -> Celsius
2. Celsius -> Fahrenheit
3. Quit
```
Use the following methods to solve this exercise: `makeMenu()` to create the menu, `getSelection()` to check the input, `getTemp()` to get the temperature, `fahrToCels()` and `calsToFahr()` for the conversions. 
<br />

🔷 **No. 22**: Reverse the digits of a three-digit number by using a `reverseDigits()` method. <br />

🔷 **No. 23**: Create four overloaded `add()` methods:
```
add(int a, int b);
add(int a, double b);
add(double a, int b);
add(double a, double b);
```
Determine the type of input values and call the appropriate method.
 <br />

🔷 **No. 24**: Calculate the sum 1 + 2 + 3 + ... + n using a recursive method. Then, modify the method to compute only odd numbers or only even numbers. <br />

🔷 **No. 25**: Compute the power of a natural number using recursion. <br />

🔷 **No. 26**: Create a recursive method that calculates the greatest common divisor (GCD) of two positive integers. <br />

🔷 **No. 27**: Solve the Tower of Hanoi problem for n = 3, n = 5, and n = 7, where n represents the number of disks to move. You may use an additional auxiliary tower to assist in the transfer. <br />

### 👨‍🔬 Lab Exercise ###
🛠️ *No. 28*: Recreate the "Guess the Number" game from the previous chapter using methods.
