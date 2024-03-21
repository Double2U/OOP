package lsp1;


import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square= new Square(5);
        ShapeView view = new ShapeView(square);
        view.showArea();
    }
}
