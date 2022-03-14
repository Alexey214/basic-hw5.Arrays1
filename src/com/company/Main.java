package com.company;

public class Main {

    public static void main(String[] args) {
        //Задача №1:
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        double[] arrDouble = {1.57, 7.654, 9.986};
        String[] arrString = {"Hello ", "World!"};

        //Задача №2:
        for (int i = 0; i < arrInt.length; i++) {
            if (i < arrInt.length - 1) {
                System.out.print(arrInt[i] + ", ");
            } else {
                System.out.println(arrInt[i]);
            }
        }
        for (int i = 0; i < arrDouble.length; i++) {
            if (i < arrDouble.length - 1) {
                System.out.print(arrDouble[i] + ", ");
            } else {
                System.out.println(arrDouble[i]);
            }
        }
        for (int i = 0; i < arrString.length; i++) {
            if (i < arrString.length - 1) {
                System.out.print(arrString[i] + ", ");
            } else {
                System.out.println(arrString[i]);
            }
        }

        //Задача №3:
        for (int i = arrInt.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrInt[i] + ", ");
            } else {
                System.out.println(arrInt[i]);
            }
        }
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrDouble[i] + ", ");
            } else {
                System.out.println(arrDouble[i]);
            }
        }
        for (int i = arrString.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrString[i] + ", ");
            } else {
                System.out.println(arrString[i]);
            }
        }
        //Задача №4:
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                System.out.print(arrInt[i] + 1 + " ");
            } else {
                System.out.print(arrInt[i] + " ");
            }
        }
    }
}
