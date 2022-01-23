/**
Input = [ 12, 3, 1, 2, -6, 5, -8, 6 ]  target: 0 

Sample Output = [ [-8, 2, 6], [-8, 3, 5], [-6, 1, 5]



Assume the following: 
Input is non empty 
if no arrays add up to target sum, then return an empty array 
return 2D array full of answers
each triplet should be in ascending order 
triplets themselves should be in ascending order with respect to the numbers they hold 
Assume there is more than one answer in input 
Numbers in integer can be used once in triplet but can be used across triplets 


Ways to solve the problem: 
Use three for loops to traverse through the array: 
Time o(n^3) - which is really slow
Use a hashtable and a double for loop, check if the third number you need is within the hashtable 
Uses a lot of space 
complications can return duplicate triplets like [6, -2, 8] and [-2, 6, 8] 
Sort the array and use the left and right pointer to find the answer 
Time o(n^2) + n * log(n) ----> converges to o(n^2) 
Space o(n) 
This is the solution im going to code out 














Input = [ 12, 3, 1, 2, -6, 5, -8, 6 ]  target: 0 

Step 1: Sort the array - o (n*log(n)) Average time 

 
           0   1  2  3  4  5  6  7 
            [ -8, -6, 1, 2, 3, 5, 6, 12]       target = 0 
                      ^           ^        


result = ( -8 ) + ( 1 ) + ( 12 ) = 5   


Step 2: Initialize two pointers to traverse the array 

Pusedocode 

idx1 = 1
idx2 = arr.length - 1; 
for int element in array: o(n) 
currentelement = element

while(left> right) {   o(n) 
int result = idx + idx1 + idx2; 

if (result > target) {
    idx2--; 
    continue;
} 

if (result < target) {
    idx1++; 
    continue;
} 

results [ current element, idx1, idx2] 
idx1++; 
idx2--; 

} 

return [] 

**/ 


//Working code: 

Public static List<Integer[]> threeNumberSum(int[] array, int targetSum){

Arrays.sort(array); 
List<Integer> triplets = new ArrayList<Integer[]>(); 

// array.length - 2 will allow us to always have two values 

For(int i = 0; i < array.length - 2; i++) {
    int left = i+1; 
    int right = array.length-1;

while (left < right) {
 int currentSum = array[i] + array[left] + array[right]’ 
if(currentSum == target){
integer[] newTriplet = {array[i], array[left], array[right]}; 
triplets.add(newTriplet); 
left++; 
right--; 
 } 

else if( currentSum < targetSum) {
left++;
} 
else if(currentSum > targetSum) {
right--; 
} 
    } 
  } 
} 

return triplets; 
} 


