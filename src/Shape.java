public abstract class Shape {
    protected final String id;
    protected double dimension;
    protected Renderer renderer;

    protected Shape(String id, double dimension, Renderer renderer) {
        this.id = id;
        this.dimension = dimension;
        this.renderer = renderer;
    }

    public String getId() {
        return id;
    }

    public double getDimension() {
        return dimension;
    }

    public void setImplementation(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String execute();
}