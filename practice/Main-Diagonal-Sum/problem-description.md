# Sum of Main Diagonal Elements

## **Problem Description**

You are given an **N × N integer matrix A**.  
Your task is to compute the **sum of all elements on the main diagonal**.

The **main diagonal** of a matrix consists of elements `A[i][j]` where  
`i = j` — in other words, from the top-left to the bottom-right of the matrix.

---

## **Problem Constraints**

- `1 ≤ N ≤ 10³`
- `-1000 ≤ A[i][j] ≤ 1000`

---

## **Approach**

To compute the main diagonal sum, we iterate through the matrix and add every element where the row index equals the column index. Since there are exactly `N` diagonal elements, we only need a single loop from `0` to `N-1`, making the solution efficient with a time complexity of **O(N)**.
