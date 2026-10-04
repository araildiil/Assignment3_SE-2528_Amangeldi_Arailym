public class SquareRenderer extends Shape {
    public static final double SIDE = 3;

    public SquareRenderer(String id, Renderer renderer) {
        super(id, SIDE, renderer);
    }

    @Override
    public String execute() {
        return renderer.render("square", dimension);
    }
}
