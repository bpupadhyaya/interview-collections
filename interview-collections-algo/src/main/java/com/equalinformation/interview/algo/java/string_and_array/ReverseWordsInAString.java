package com.equalinformation.interview.algo.java.string_and_array;

/**
 * Due to ProgramCreek
 * Re-Created by bpupadhyaya on 6/10/16.
 *
 * Problem: Given an input string, reverse the string word by word. A word is defined
 * as a sequence of non-space characters.
 * Example problem:
 * Given string = "Sunnyvale is sunny"
 * Output: "sunny is Sunnyvale"
 *
 * Solution note: The input string does not contain leading and trailing spaces and
 * the words are always separated by a single space.
 */
public class ReverseWordsInAString {
    public static void main(String...args) {

        ReverseWordsInAString revUtil = new ReverseWordsInAString();
        char[] words = "Sunnyvale is sunny".toCharArray();

        System.out.print("Input: ");
        for(char c: words) {
            System.out.print(c);
        }
        System.out.println();

        revUtil.reverseWords(words);

        System.out.print("Output: ");
        for(char c: words) {
            System.out.print(c);
        }
    }

    public void reverseWords(char[] s) {
        int i = 0;
        for(int j=0; j < s.length; j++) {
            if(s[j] == ' ') {
                reverse(s, i, j-1);
                i = j+1;
            }
        }

        reverse(s, i, s.length - 1);
        reverse(s, 0, s.length - 1);
    }

    public void reverse(char[] s, int i, int j) {
        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
