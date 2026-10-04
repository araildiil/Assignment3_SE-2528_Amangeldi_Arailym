public class RasterRenderer implements Renderer {
    @Override
    public String renderCircle(int radius) {
        return "RASTER circle radius=" + radius + "px";
    }

    @Override
    public String renderSquare(int side) {
        return "RASTER square side=" + side + "px";
    }
}