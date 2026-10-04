public class VectorRenderer implements Renderer {
    @Override
    public String getType() {
        return "VECTOR";
    }

    @Override
    public String render(String shapeName, double dimension) {
        return "VECTOR " + shapeName + " radius=" + dimension;
    }
}