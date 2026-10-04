public class Circle extends Shape {
    public static final int RADIUS = 2;

    public Circle(String id, Renderer renderer) {
        super(id, RADIUS, renderer);
    }

    @Override
    public String execute() {
        return getRenderer().renderCircle(getDimension());
    }
}