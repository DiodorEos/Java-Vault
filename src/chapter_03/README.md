# 🔖 CHAPTER 3 - Program Flow Control #

## 👁️‍🗨️ Overview ##
The second chapter is extensive and covers a lot about variables and math:
<br />
<br />
☑️ Data types <br />
☑️ Variables and Operands <br />
☑️ Data Type Conversions <br />
☑️ Boolean and Bitwise Operations <br />
☑️ Math Functions and Formulas <br />
☑️ Data Input with Scanner <br />

## 🏋️‍♂️ Exercises ##
This chapter includes multiple types of exercises: theory-based, mathematical operations, simple programming tasks, and a full lab exercise.
<br />
### 🗒️ Theory Questions ###
I chose three intersting theory questions to answer here:
<br />
<details>
  <summary>
    ❓: No. 11: Is there a difference between the number 4 and 4.0? <br />    
  </summary>
  📇: The number 4 is an integer, while 4.0 is a floating point number. They are both numbers, but of a different data type. This is important for calculations and precision.
</details>
<details>
  <summary>
   ❓: No. 16: What is the output of the following code snippet: <br /> 
    
    int iVar = -5;
    System.out.println(-++iVar);
  </summary>
  📇: This code snippet will output the integer 4. First, the variable will increment by 1 (++iVar) which will give us -4 and, then, it will make it a negative (-), meaning the -4 will now become positive.
</details>
<details>
  <summary>
    ❓: No. 36: What will be printed on console from this code snippet: <br /> 

    System.out.println((int)(char)(byte)-1);
  </summary>
  📇: The integer 65535 will be printed out. This is the unsigned max value of 2 bytes, which the char data type supports. The negative number "underflows" the char type, since negative numbers are not present on ASCII table and thus, it takes the biggest value possible (char can hold 2 bytes of data: 0 - 65535). The full road is: -1 becomes byte type -> -1 (because byte data type holds values from -128 to 127), then it becomes a char -> unresolved character due to the underflow, then that will become the highest possible integer value available for the byte data type -> 65535 -> and that is already an integer and is already a value that can be held by this data type.
</details>

### 🖥️ Practical Exercises ###
🔷 **No. 37**: Convert an input value in inches to centimeters. <br />

🔷 **No. 38**: Convert an input temperature in Fahrenheit to Celsius. <br />

🔷 **No. 39**: Write a program accepts three double variables and prints out: the average, the min, and max. What will happen if, by mistake, you enter 5.4a instead of 5.4? <br />

🔷 **No. 40**: Calculate the energy (E) using accepted mass (m) with Einstein’s formula E = mc². <br />

🔷 **No. 42**: Check if an input integer is a power of 2. <br />

🔷 **No. 43**: Write a program that accepts a three-digit number (100-999) and outputs the sum of its digits. <br />

### 👨‍🔬 Lab Exercise ###
🛠️ *No. 44*: A ticket vending machine accepts 10 and 5 euro bills, and coins of 2, 1, 0.5, 02, 0.1 euro. The change that gives out are only in 5 euro bills and coins. The user inserts the amount of tickets they need, and the amount of payment they provide. The machine will calculate the change and also, calculate the amount of each type of change it will give out. Write a program that simulates this vending machine. <br />
<details>
  <summary>
    👣 Coding steps:    
  </summary>
1. Print the cost of the ticket (1.2 euro), saved in a double cost variable. <br />
2. Ask the user to enter the amount of tickets they want and save that info to an int numOfTickets. <br />
3. Calculate the cost and save it to a double amount variable. The variable should make sense and be rounded up (ex. 5.59999996 should be 5.6). Print the cost on screen. <br />
4. Print an "Enter the amount you want to insert:" message, and ask for the user to input the inserted amount and save it as a double pay variable. <br />
5. Calculate the change (if any) and save it in an int changes variable that holds the change in cents. Print that on screen. <br />
6. To calculate the changes follow these instructions: <br />
a) for the 5 bills, divide the changes variable with 500 and save the result in a numOf5 variable. The integer rest is reassigned to the changes variable. <br />
b) do the above for for numOf2, numOf1, numOf_50, numOf20 and numOf_10 to find the the changes for the 2 and 1 euro, and 50, 20 and 10 cents as well. <br />
7. Print "The changes amount is: " and below that, show the number for 5, 2 and 1 euro, and 50, 20 and 10 cents that correspond to the changes that need to be given to the user.
</details>
