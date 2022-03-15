package com.company.ProblemSolving.HackerRank.DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {
    public static void main (String[] args) {

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String S = bufferedReader.readLine();

            bufferedReader.close();

            int foo;

            try {
                foo = Integer.parseInt(S);
                System.out.println(foo);
            } catch (NumberFormatException e) {
                System.out.println("Bad String");
            }
        }
    }
}
