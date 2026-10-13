package com.hcl.library.model;

public class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, int year, String author, String isbn) {
        super(title, year);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    @Override
    public double lateFee(int daysLate) {
        return Math.max(0, daysLate) * 2.0;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", ", " + author + ", " + isbn + "]");
    }
}