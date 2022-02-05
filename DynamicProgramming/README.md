# DynamicProgramming
## Memorization Recipe: Use if you dont need to solve all sub problems 

	1. Come up with a recursive solution
		- Visualize the problem as a tree
		- Large problem can be broken down into smaller sub problems as edges of nodes
		- Implement a tree visualization using brute force solution
		- Test your code to make sure it works

	2. Optimize the recursive solution
		- Add a memo object
		- Keys represent arguments to our function
		- values represent return values for those functions
		- unique set of arguments will give a particular result
		- make sure object is shared between recursive calls


		- add base case to return memo values
			 ** this is different than original base cases in my function**

		- store return values into our memo object

  ## Memorization Pros and Cons
  
  
  **Pros**
  - Easy to implement in code 
  - Uses less space than tabulation 
 
 **Cons**
  - Slow compared to tabulation: Usually implemented recurisvely 





## Tabulation Recipe: Use if you need to solve all Sub Problems 

    1. Visualize the problem as a table
        - what should the table size be? Should be passed on inputs 
    
    2. initalize the table with default values 
        - usually a good idea to stay consistent with return types of your function 
    
    3. Seed the trivial answer into the table
    
    
    4. iterate through the table and fill further positions on the current position
        - this is the pattern between the sub problems within your big problem 
        - focus on what options you have in your problem 
  
  
## Tabulation Pros and Cons
           
  **Pros**
  - Faster than Memozation because it uses iteration
 
 **Cons**
  - Uses more space due to every entry in table being filled 


# Dynamic Programming Patterns for Coding Interviews

- Pattern 1: 0/1 Knapsack

- Pattern 2: Unbounded Knapsack

- Pattern 3: Fibonnaci Numbers

- Pattern 4: Longest Palindromic Subsequence

- Patter 5: Longest Common Substring 


