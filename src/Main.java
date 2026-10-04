public class Main {
    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals("--demo")) {
            demo();
        } else {
            System.out.println("Usage: java -cp out Main --demo");
        }
    }

    static void demo() {
        int passed = 0;
        int total = 0;


        total++;
        Shape a1i1 = new Circle("C1", new VectorRenderer());
        String t1 = a1i1.execute();
        String exp1 = "VECTOR circle radius=2";
        passed += check("T1", exp1.equals(t1),
                a1i1.getClass().getSimpleName() + " + VectorRenderer", t1, exp1);


        total++;
        Shape a1i2 = new Circle("C2", new RasterRenderer());
        String t2 = a1i2.execute();
        String exp2 = "RASTER circle radius=2px";
        passed += check("T2", exp2.equals(t2),
                a1i2.getClass().getSimpleName() + " + RasterRenderer", t2, exp2);


        total++;
        Shape a2i1 = new Square("S1", new VectorRenderer());
        String t3 = a2i1.execute();
        String exp3 = "VECTOR square side=3";
        passed += check("T3", exp3.equals(t3),
                a2i1.getClass().getSimpleName() + " + VectorRenderer", t3, exp3);


        total++;
        Shape a2i2 = new Square("S2", new RasterRenderer());
        String t4 = a2i2.execute();
        String exp4 = "RASTER square side=3px";
        passed += check("T4", exp4.equals(t4),
                a2i2.getClass().getSimpleName() + " + RasterRenderer", t4, exp4);


        total++;
        Shape sw = new Circle("C5", new VectorRenderer());
        Shape refBefore = sw;
        String before = sw.execute();
        String idBefore = sw.getId();
        int dimBefore = sw.getDimension();

        sw.setImplementation(new RasterRenderer());

        Shape refAfter = sw;
        String after = sw.execute();
        String idAfter = sw.getId();
        int dimAfter = sw.getDimension();

        boolean sameObject = (refBefore == refAfter);
        boolean stateUnchanged = idBefore.equals(idAfter) && dimBefore == dimAfter;
        boolean ok = sameObject && stateUnchanged
                && before.equals("VECTOR circle radius=2")
                && after.equals("RASTER circle radius=2px");

        String actual = "sameObject=" + sameObject
                + ", stateUnchanged=" + stateUnchanged
                + ", before=" + before
                + ", after=" + after;
        passed += check("T5", ok, "Circle switch Vector->Raster", actual, null);


        total++;
        Shape a1i3 = new Circle("C6", new AsciiRenderer());
        String t6 = a1i3.execute();
        String exp6 = "ASCII (circle r=2)";
        passed += check("T6", exp6.equals(t6),
                a1i3.getClass().getSimpleName() + " + AsciiRenderer", t6, exp6);


        total++;
        Shape a2i3 = new Square("S3", new AsciiRenderer());
        String t7 = a2i3.execute();
        String exp7 = "ASCII [square s=3]";
        passed += check("T7", exp7.equals(t7),
                a2i3.getClass().getSimpleName() + " + AsciiRenderer", t7, exp7);

        System.out.println("SUMMARY: " + passed + "/" + total + " PASS");
    }

    static int check(String id, boolean ok, String classes, String actual, String expected) {
        if (ok) {
            System.out.println(id + " PASS | " + classes + " | result=" + actual);
            return 1;
        } else {
            System.out.println(id + " FAIL | " + classes + " | actual=" + actual
                    + " | expected=" + expected);
            return 0;
        }
    }
}