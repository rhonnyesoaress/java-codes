package com.google.rw.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[] {1, 2, 3, 4};
        arrayInt[2] = new int[6];

        for(int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
