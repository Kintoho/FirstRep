package ru.ssau.tk.alexanderkhkh.FirstRep;

import java.util.Date;

public class Person {
    private String name;
    private double hight;
    private double weitght;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeitght() {
        return weitght;
    }

    public void setWeitght(double weitght) {
        this.weitght = weitght;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

