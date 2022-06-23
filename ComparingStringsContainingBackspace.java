import java.util.*;
/*
Problem Challenge 2
Comparing Strings containing Backspaces (medium)
Given two strings containing backspaces (identified by the character ‘#’), 
check if the two strings are equal.
Example 1:
Input: str1="xy#z", str2="xzz#"
Output: true
Explanation: After applying backspaces the strings become "xz" and "xz" 
respectively.

Example 2:
Input: str1="xy#z", str2="xyz#"
Output: false
Explanation: After applying backspaces the strings become "xz" and "xy" 
respectively.

Example 3:
Input: str1="xp#", str2="xyz##"
Output: true
Explanation: After applying backspaces the strings become "x" and "x" 
respectively.
In "xyz##", the first '#' removes the character 'z' and the second '#' 
removes the character 'y'.

Example 4:
Input: str1="xywrrmp", str2="xywrrmu#p"
Output: true
Explanation: After applying backspaces the strings become 
"xywrrmp" and "xywrrmp" respectively.
*/

public class ComparingStringsContainingBackspace {
	
	public static boolean compareStrings(String str1, String str2) {
		String s1 = "";
		String s2 = "";
		int count = 0;
		for(int i = str1.length() - 1; i >= 0; i--) {
			if(str1.charAt(i) == '#') {
				count++;
			}
			else if(count == 0) {
				s1 += str1.charAt(i);
			}
			else {
				count--;
			}
		}
		count = 0;
		for(int i = str2.length() - 1; i >= 0; i--) {
			if(str2.charAt(i) == '#') {
				count++;
			}
			else if(count == 0) {
				s2 += str2.charAt(i);
			}
			else {
				count--;
			}
		}
		
		return s1.equals(s2);
	}

	public static void main(String[] args) {
		String str1="xywrrmp", str2="xywrrmu#p";
		System.out.println(compareStrings(str1, str2));

	}

}
