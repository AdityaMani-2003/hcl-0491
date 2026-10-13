package com.hcl.library.model;

import java.time.Year;

public abstract class LibraryItem implements com.hcl.library.model.Borrowable, Comparable<LibraryItem> {
    private static int nextId = 1001;

    private final int id;
    private String title;
    private int year;
    private boolean available = true;

    public LibraryItem(String title, int year) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (year < 1900 || year > Year.now().getValue()) {
            throw new IllegalArgumentException("Invalid publication year");
        }
        this.id = nextId++;
        this.title = title;
        this.year = year;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
    @Override public boolean isAvailable() { return available; }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    @Override public void borrow() { available = false; }
    @Override public void giveBack() { available = true; }

    public abstract double lateFee(int daysLate);

    @Override
    public int compareTo(LibraryItem other) {
        return title.compareToIgnoreCase(other.title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LibraryItem)) return false;
        LibraryItem other = (LibraryItem) obj;
        return id == other.id;
    }

    @Override public int hashCode() { return Integer.hashCode(id); }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + id + ", " + title + ", " +
                year + ", " + (available ? "Available" : "Issued") + "]";
    }
}