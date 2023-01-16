package me.wellyfrs.codility.lessons.lesson7;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {
        if (H.length == 1) {
            return 1;
        }

        int numOfBlocks = 0;
        Stack<Integer> blocks = new Stack<>();

        for (int h : H) {
            while (!blocks.isEmpty() && h < blocks.peek()) {
                blocks.pop();
            }

            if (blocks.isEmpty()) {
                numOfBlocks++;
                blocks.push(h);
            } else if (blocks.peek() < h) {
                numOfBlocks++;
                blocks.push(h);
            }
        }

        return numOfBlocks;
    }

}
