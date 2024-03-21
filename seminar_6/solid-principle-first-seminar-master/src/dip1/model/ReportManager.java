package dip1.model;

import java.util.List;

public class ReportManager {

    Printerable printerable;

    public ReportManager (Printerable printerable) {
        this.printerable = printerable;
    }
    
    public void toPrint(List<ReportItem> items){
        printerable.print(items);
    }
}
