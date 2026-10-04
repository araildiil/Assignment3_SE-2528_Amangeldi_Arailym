import java.util.Objects;

public abstract class Shape {
    private final String id;
    private final int dimension;
    private Renderer renderer;

    protected Shape(String id, int dimension, Renderer renderer) {
        this.id = Objects.requireNonNull(id);
        this.dimension = dimension;
        this.renderer = Objects.requireNonNull(renderer);
    }

    public String getId() {
        return id;
    }

    public int getDimension() {
        return dimension;
    }

    protected Renderer getRenderer() {
        return renderer;
    }

    public void setImplementation(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer);
    }

    public abstract String execute();
}