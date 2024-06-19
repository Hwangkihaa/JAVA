package item;

import java.io.Serializable;

public class ExpenseItem implements Serializable {
    private String date;
    private String description;
    private double amount;
    private boolean isIncome;

    public ExpenseItem(String date, String description, double amount, boolean isIncome) {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.isIncome = isIncome;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isIncome() {
        return isIncome;
    }

    @Override
    public String toString() {
        return date + " | " + description + " | " + (isIncome ? "수입" : "지출") + " | " + amount;
    }
}
