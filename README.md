# Number Guessing Game 🎯

A simple console-based Number Guessing Game written in Java.

The program randomly selects a number between **1 and 100**, and the player has **10 attempts** to guess it correctly. After each guess, the player receives feedback on whether the guess was too high or too low.

## 📌 Features

- Random number generation between 1 and 100  
- 10 chances to guess the correct number  
- Input validation to handle non-numeric or out-of-range values  
- Option to play multiple rounds  
- Friendly prompts and feedback  

## 🚀 How to Run

1. Make sure you have **Java installed** on your system.  
   You can check by running:

   ```bash
   java -version

2. Compile the program:
javac NumberGuessing.java

3. Run the program:
java NumberGuessing

Sample Output:
Welcome to the Number Guessing Game!
I am thinking of a number between 1 and 100. Can you guess it in 10 attempts?
Enter your guess: 50
Your number is too small.
Remaining Attempts: 9
...
Do you want to play again? (yes / no):
