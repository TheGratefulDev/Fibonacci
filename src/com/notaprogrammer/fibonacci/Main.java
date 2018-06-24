package com.notaprogrammer.fibonacci;

public class Main {

    //0, 1, 1, 2, 3, 5, 8
    public static void main(String[] args) {
        fibonacci(20);
    }

    private static void fibonacci(int number) {
        print(0);
        print(1);

        int number1 = 0;
        int number2 = 1;

        for(int i=0; i<number; i++){

            int numberOut = number1 + number2;
            print(numberOut);

            number1 = number2;
            number2 = numberOut;
        }
    }

    private static void print(int i){
        System.out.println(i);
    }
}
