# Kth Smallest Element

## Problem Description
Find the B-th smallest element in array A.

**Note:** Try to solve it using at most B swaps.

## Constraints
- 1 <= |A| <= 100000  
- 1 <= B <= min(|A|, 500)  
- 1 <= A[i] <= 1e9  

## Approach
Use a partial selection-sort logic:  
For i from 0 to B-1, find the smallest element in range [i…N-1] and swap it with A[i].  
Return A[B-1].


## Solution

See the implementation in:  
`code.java`
