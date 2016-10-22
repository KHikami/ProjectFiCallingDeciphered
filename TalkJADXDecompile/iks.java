public final class iks {
    static final Object a;
    static boolean b;
    static iud c;
    static ky<Integer, iud> d;
    static ky<Integer, iud> e;
    static ky<Integer, iud> f;

    static {
        a = new Object();
        d = new ky();
        e = new ky();
        f = new ky();
    }

    public static iud a(int i) {
        c();
        return (iud) d.get(Integer.valueOf(i));
    }

    public static iud b(int i) {
        c();
        return (iud) e.get(Integer.valueOf(i));
    }

    public static iud a() {
        c();
        return c;
    }

    public static iud c(int i) {
        c();
        return (iud) f.get(Integer.valueOf(i));
    }

    public static void b() {
        synchronized (a) {
            b = true;
            a.notifyAll();
        }
    }

    private static void c() {
        synchronized (a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + 10000;
                while (!b) {
                    a.wait(10);
                    if (System.currentTimeMillis() >= currentTimeMillis) {
                        throw new RuntimeException("Video specs wait timed out (at least 10000ms elapsed)");
                    }
                }
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}
