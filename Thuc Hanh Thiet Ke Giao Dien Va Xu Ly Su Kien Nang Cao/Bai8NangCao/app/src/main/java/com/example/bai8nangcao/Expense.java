package com.example.bai8nangcao;

public class Expense {
    private String name;
    private double amount;
    private String type;
    private String date;

    public Expense(String name, double amount, String type, String date) {
        this.name = name;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return name + " - " + amount + " - " + type + " - " + date;
    }
}
