package dev.SumOfDigits;

public class Kata {
    public static int main(int n) {
        String[] str = Integer.toString(n).split("");
        int x = 0;
        if (str.length > 1) {
            for (String i: str) {
                x += Integer.parseInt(i);
            }
        }

        System.out.println(x);
        if (x >= 10) {
            return Kata.main(x);
        } else {
            return x;
        }
    }
}
