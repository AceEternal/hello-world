package com.test.finaldecorate.pk3;

/*public class ParentDemo {
    final int NUM=0;
    public ParentDemo(int NUM){
        this.NUM=NUM;//会报错，因为前面已经赋值了，
    }
}*/

public class ParentDemo {
final int NUM;
    public ParentDemo(int NUM){
        this.NUM=NUM;//编译通过，
    }
}