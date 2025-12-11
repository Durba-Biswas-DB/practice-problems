# String Transformation Operations

## Problem Description

Akash likes playing with strings. One day, he thought of applying the following operations on a string **in the given order**:

1. **Concatenate** the string with itself.  
2. **Delete all uppercase letters** from the resulting string.  
3. **Replace each vowel** (`a`, `e`, `i`, `o`, `u`) with `#`.

You are given a string **A** of size **N**, consisting of lowercase and uppercase alphabets.  
Return the resultant string after applying all the above operations.

**Note:**  
Vowels are: `a`, `e`, `i`, `o`, `u`

---

## Problem Constraints

- `1 <= N <= 100000`

---

## Approach

The transformation can be efficiently performed in linear time:

- First, concatenate the string with itself to form a new longer string.
- Iterate through the doubled string and skip all uppercase characters.
- For each lowercase character, check if it is a vowel and replace it with `#` or keep it as is.
- Build the final transformed output using a `StringBuilder` to ensure optimal performance for large inputs.

