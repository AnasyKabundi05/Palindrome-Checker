# Practical – Strings – Palindrome & Sentences Project

## Overview
This project implements a Java application that checks whether a given string is a **Palindrome**.

A **Palindrome** is a word or sentence that reads the same forwards and backwards.

Examples:
- `abba`
- `navan`
- `able was I ere I saw Elba`

The program allows the user to input a string and determines if it is a palindrome by comparing characters individually.

---

## Objective
The goal of this project is to practice working with:

- Java **Strings**
- **StringBuilder**
- **Methods**
- **Loops**
- **Character indexing with `charAt()`**
- **Boolean return values**

---

## Task Description

Design and implement a Java application called **Palindrome** that:

1. Prompts the user to enter a string.
2. Calls a method `isPalindrome(String s)`.
3. Checks whether the string is a palindrome.
4. Returns `true` if the string is a a palindrome and `false` otherwise.

---

## Important Requirements

- Do **NOT** use:
  - `StringBuilder.reverse()`
  - Any built-in reverse methods.
- The string must be checked **character by character**.
- Use **`StringBuilder.append()`** to build sentences where needed.
- Convert the string to uppercase using `toUpperCase()` to make comparisons case insensitive.

---

## Key Java Methods Used

### `charAt(int index)`
Returns the character at a specific index in the string.
