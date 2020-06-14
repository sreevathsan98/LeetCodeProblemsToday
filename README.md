# LeetCodeProblemsToday
Day1
The Problem name is 1-bit and 2-bit Characters at leetcode under easy section. The tags are arrays 


We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.

Input: 
bits = [1, 0, 0]
Output: True
Explanation: 
The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.


Input: 
bits = [1, 1, 1, 0]
Output: False
Explanation: 
The only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
     for(int i=0;i<bits.length;){
         if(i==bits.length-1&&bits[i]==0){
             return true;
         }
        if(bits[i]==1&&i+1<bits.length){
            i=i+2;
        }
         else{
             i++;
         }
        
     }
    return false;
    }
} 
