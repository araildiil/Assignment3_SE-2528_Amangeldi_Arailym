public interface Renderer {
    String getType();
    String render(String shapeName, double dimension);
}