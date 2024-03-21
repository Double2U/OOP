package dip1.model.util;

import java.util.List;

import dip1.model.Printerable;
import dip1.model.ReportItem;

public class ConsolePrinter implements Printerable {
   
    @Override
    public void print(List<ReportItem> items) {
        System.out.println("Output to console");
        for (ReportItem item : items) {
            System.out.format("console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}



