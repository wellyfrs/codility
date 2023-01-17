package me.wellyfrs.codility.lessons.lesson5;

public class CountDiv {

    public int solution(int A, int B, int K) {
        return (B - A) / K + (A % K == 0 ? 1 : 0);
    }
}
