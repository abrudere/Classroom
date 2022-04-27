package com.company;

public class Student {
    String name;
    private String grade;
    int feesTotal;
    private int feesPaid = 0;


    void setGrade(String grade) {
        this.grade = grade;
    }

    void setFeesPaid(int fees) {
        feesPaid += fees;
    }

    int getFeesPaid() {
        return feesPaid;
    }

}
