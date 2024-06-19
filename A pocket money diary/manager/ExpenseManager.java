package manager;

import item.ExpenseItem;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager extends AbstractExpenseManager {
    public List<ExpenseItem> items = new ArrayList<>();

    @Override
    public void addItem(ExpenseItem item) {
        items.add(item);
    }

    @Override
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        } else {
            System.out.println("항목이 존재하지 않습니다.");
        }
    }

    @Override
    public void displayItems() {
        for (ExpenseItem item : items) {
            System.out.println(item);
        }
        double total = calculateTotal();
        System.out.println("총합 : " + total);
    }

    public double calculateTotal() {
        double total = 0;
        for (ExpenseItem item : items) {
            if (item.isIncome()) {
                total += item.getAmount();
            } else {
                total -= item.getAmount();
            }
        }
        return total;
    }

    public List<ExpenseItem> getItems() {
        return new ArrayList<>(items);
    }
}

