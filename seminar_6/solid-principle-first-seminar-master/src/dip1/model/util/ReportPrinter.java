package dip1.model.util;

import dip1.model.Printerable;
import dip1.model.ReportItem;

import java.util.List;

public class ReportPrinter implements Printerable{

    @Override
    public void print(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
