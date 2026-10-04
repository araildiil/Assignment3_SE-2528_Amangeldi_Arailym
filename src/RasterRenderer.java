public class RasterRenderer implements Renderer {
    @Override
    public String getType() {
        return "RASTER";
    }

    @Override
    public String render(String shapeName, double dimension) {
        return "RASTER " + shapeName + " side=" + dimension + "px";
    }
}