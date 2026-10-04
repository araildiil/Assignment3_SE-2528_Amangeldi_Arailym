public class AsciiRenderer implements Renderer {
    @Override
    public String renderCircle(int radius) {
        return "ASCII (circle r=" + radius + ")";
    }

    @Override
    public String renderSquare(int side) {
        return "ASCII [square s=" + side + "]";
    }
}
