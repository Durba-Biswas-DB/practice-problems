# Search in a Row-wise and Column-wise Sorted Matrix

## Problem Description

Given a matrix of integers **A** of size **N x M** and an integer **B**.

In the given matrix, **every row and every column is sorted in non-decreasing order**.  
Find and return the position of **B** in the matrix in the following form:

- If `A[i][j] = B`, return `(i * 1009 + j)`
- If **B** is not present, return `-1`

### Notes
- Rows are numbered from **top to bottom**
- Columns are numbered from **left to right**
- **Use 1-based indexing**
- If multiple occurrences of **B** exist, return the **smallest value of (i * 1009 + j)**
- Expected time complexity is **O(N + M)**

## Problem Constraints

- `1 <= N, M <= 1000`
- `-100000 <= A[i][j] <= 100000`
- `-100000 <= B <= 100000`

  
