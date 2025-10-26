package com.example.ex0231.ex1;

public class Book extends Product{
    private String writer;

    public Book(String name, double price, String description, String writer) {
        super(name, price, description);
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and the writer is: " + this.writer;
    }
}
