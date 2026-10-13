package com.hcl.library.model;

public class Magazine extends com.hcl.library.model.LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public double lateFee(int daysLate) {
        return Math.max(0, daysLate) * 1.0;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", ", issue " + issueNumber + "]");
    }
}