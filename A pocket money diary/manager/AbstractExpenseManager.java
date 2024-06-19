package manager;

import item.ExpenseItem;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractExpenseManager {
    public List<ExpenseItem> items;

    public AbstractExpenseManager() {
        items = new ArrayList<>();
    }

    public abstract void addItem(ExpenseItem item);

    public abstract void removeItem(int index);

    public abstract void displayItems();
}
