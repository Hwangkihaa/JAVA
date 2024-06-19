package io;

import item.ExpenseItem;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static void saveToFile(String filename, List<ExpenseItem> items) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (ExpenseItem item : items) {
                writer.write(item.toString());
                writer.newLine();
            }
        }
    }

    public static List<ExpenseItem> loadFromFile(String filename) throws IOException {
        List<ExpenseItem> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" \\| ");
                String date = parts[0];
                String description = parts[1];
                boolean isIncome = parts[2].equals("수입");
                double amount = Double.parseDouble(parts[3]);
                items.add(new ExpenseItem(date, description, amount, isIncome));
            }
        }
        return items;
    }
}
