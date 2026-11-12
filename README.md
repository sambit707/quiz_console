# Quiz Console App

A Java-based console application that tests the user's knowledge through multiple-choice questions, tracks the score, and shows a final result at the end.

## Project Overview

This project is designed to help learners build a complete Java application from basic to advanced level concepts. It is a practical project for understanding how Java works in real-world applications while keeping the code simple enough for beginners.

## Why This Project Is Useful

This app helps in learning:

- Java basics such as variables, loops, conditionals, and methods
- Java classes and objects
- Arrays and collections
- User input using the scanner
- OOP concepts such as encapsulation and abstraction
- Exception handling
- File handling for storing quiz data or scores
- Advanced features such as modular design, reusable classes, and better project structure

## Core Features

- Console-based quiz interface
- Multiple-choice questions
- Input validation
- Score counting
- Instant feedback for correct and incorrect answers
- Final result summary
- Clean structure for future expansion

## Example Flow

1. Program starts
2. Quiz questions are displayed one by one
3. User enters an answer
4. Program compares it with the correct answer
5. Score is updated
6. Final result is shown after all questions

## Java Concepts Covered

### Basic Java

- `main` method
- Variables and data types
- `if` / `else` conditions
- `for` / `while` loops
- Methods and method overloading
- Scanner for user input

### Intermediate Java

- Classes and objects
- Constructors
- Arrays and ArrayList
- Encapsulation
- Static keyword
- String handling
- Basic exception handling

### Advanced Java Concepts

- Object-oriented design
- Reusable class architecture
- Better separation of concerns
- File I/O for saving scores
- Collections and data structures
- Clean modular code for future enhancement

## Tech Stack

- Java
- Java Standard Library
- Console input/output
- Optional: file handling, collections, and OOP structure

## How to Run

Compile and run the Java program from the terminal:

```bash
javac Main.java
java Main
```

If your entry class is named differently, use that class name while compiling and running.

## Recommended Project Structure

```text
quiz-console/
├── README.md
├── Main.java
├── QuizApp.java
├── Question.java
├── User.java
├── src/
└── data/
```

A simple Java project structure may include:

- `Main.java` — program entry point
- `QuizApp.java` — quiz logic
- `Question.java` — question class
- `User.java` — user/player data
- `data/` — optional file storage for questions or scores

## Sample Java Code Example

```java
public class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
```

## Future Enhancements

- Randomized questions
- Multiple quiz categories
- Timer-based rounds
- Leaderboard and high scores
- Difficulty levels
- Save quiz history in a file
- Add admin mode for creating new questions

## License

This project is intended for learning, practice, and personal development.

## Author

Sambit patnaik
