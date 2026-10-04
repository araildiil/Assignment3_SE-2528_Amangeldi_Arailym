public class Square extends Shape {
    public static final int SIDE = 3;

    public Square(String id, Renderer renderer) {
        super(id, SIDE, renderer);
    }

    @Override
    public String execute() {
        return getRenderer().renderSquare(getDimension());
    }
}