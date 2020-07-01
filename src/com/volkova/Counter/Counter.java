package com.volkova.Counter;

public class Counter {
    public int count;

    public Counter() { count++;
    }

    public int getCount() {
        count = this.count;
        return count;
    }

    public void Counter() {
        int randomNew = (int) (Math.random() * 100);
        for (int i = 0; i < randomNew; i++) ;
        System.out.println(randomNew);
    }
    }