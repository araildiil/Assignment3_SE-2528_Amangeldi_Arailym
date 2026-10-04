public class Circle extends Shape {
    public static final double RADIUS = 2;

    public Circle(String id, Renderer renderer) {
        super(id, RADIUS, renderer);
    }

    @Override
    public String execute() {
        return renderer.render("circle", dimension);
    }
}