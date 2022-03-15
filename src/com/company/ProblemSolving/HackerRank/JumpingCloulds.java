package com.company.ProblemSolving.HackerRank;

import java.util.List;

public class JumpingCloulds {

    public static int jumpingOnClouds(List<Integer> c) {
        int answer = 0;

        for (int i = 1; i < c.size() - 2; i++) {
            if (c.get(i + 1) == c.get(i) && c.get(i + 2) != 1) {
                answer += 2;
                i++;
            }
            if (c.get(i + 1) == 1) {
                i++;
            }
            answer++;
        }
        return answer;
    }
}
