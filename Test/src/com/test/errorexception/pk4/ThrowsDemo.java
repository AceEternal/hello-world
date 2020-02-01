package com.test.errorexception.pk4;

class Math{
    public int div(int i,int j) throws Exception{
        int t=i/j;
        return t;
    }
}

public class ThrowsDemo {
    public static void main(String args[]) throws Exception{
        Math m=new Math();
   }
}