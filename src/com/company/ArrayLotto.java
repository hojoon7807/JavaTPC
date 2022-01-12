package com.company;

public class ArrayLotto {
    public static void main(String[] args) {
        ArrayLotto array = new ArrayLotto();
        int [][] array2 = new int[1][1];
        System.out.println(array);
        System.out.println(new ArrayLotto[0]);
        System.out.println(new String[0]);
        System.out.println(array2[0][0]);
        int j = array.returnInt();
        System.out.println(++ j);
        System.out.println(array.returnInt());
        Study study = new Study();

    }

    public void init(){
        int [] lottoNUmbers = new int[7];
        lottoNUmbers[0] = 1;
        lottoNUmbers[1] = 1;
        lottoNUmbers[2] = 1;
    }

    public int returnInt(){
        int i = 0;
        return i++;
    }
}
