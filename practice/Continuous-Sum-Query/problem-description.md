# Continuous Sum Query

## Problem Description

There are **A beggars** sitting in a row outside a temple. Each beggar initially has an empty pot.

When devotees come to the temple, they donate some amount of coins to these beggars.  
Each devotee gives a fixed amount of coins to **K beggars sitting next to each other**.

You are given the donation details in a 2D array **B**, where:
- `B[i][0] = L` (starting index)
- `B[i][1] = R` (ending index)
- `B[i][2] = P` (coins donated)

For every devotee, coins `P` are added to beggars from index **L to R** (1-based indexing).

Your task is to find the **final amount of money in each beggar’s pot** at the end of the day.

---

## Problem Constraints

- `1 <= A <= 2 * 10^5`
- `1 <= L <= R <= A`
- `1 <= P <= 10^3`
- `0 <= length of B <= 10^5`

  
