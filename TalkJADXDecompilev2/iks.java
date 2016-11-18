package defpackage;

public final class iks {
    static final Object a = new Object();
    static boolean b;
    static iud c;
    static ky<Integer, iud> d = new ky();
    static ky<Integer, iud> e = new ky();
    static ky<Integer, iud> f = new ky();

    public static iud a(int i) {
        iks.c();
        return (iud) d.get(Integer.valueOf(i));
    }

    public static iud b(int i) {
        iks.c();
        return (iud) e.get(Integer.valueOf(i));
    }

    public static iud a() {
        iks.c();
        return c;
    }

    public static iud c(int i) {
        iks.c();
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
