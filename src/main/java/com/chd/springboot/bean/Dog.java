package com.chd.springboot.bean;

/**
 * @Auther:xue
 * @Date:2020/2/9 17:01
 */
public class Dog {
    private String dname;

    @Override
    public String toString() {
        return "Dog{" +
                "dname='" + dname + '\'' +
                ", dage=" + dage +
                '}';
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDage() {
        return dage;
    }

    public void setDage(int dage) {
        this.dage = dage;
    }

    private int dage;
}
