package org.example;

public class SumCalculator {
    public static void main(String[] args) {
        sum(3);
    }
    public static int sum(int digit){
        int result = 0;
        if (digit <= 0) throw new IllegalArgumentException();
        for (int i = 1; i <= digit; i++){
            result +=i;
        }
        System.out.println(result);
        return result;
    }
}