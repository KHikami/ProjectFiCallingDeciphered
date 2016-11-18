package p000;

public final class iks {
    static final Object f17939a = new Object();
    static boolean f17940b;
    static iud f17941c;
    static ky<Integer, iud> f17942d = new ky();
    static ky<Integer, iud> f17943e = new ky();
    static ky<Integer, iud> f17944f = new ky();

    public static iud m22202a(int i) {
        iks.m22206c();
        return (iud) f17942d.get(Integer.valueOf(i));
    }

    public static iud m22203b(int i) {
        iks.m22206c();
        return (iud) f17943e.get(Integer.valueOf(i));
    }

    public static iud m22201a() {
        iks.m22206c();
        return f17941c;
    }

    public static iud m22205c(int i) {
        iks.m22206c();
        return (iud) f17944f.get(Integer.valueOf(i));
    }

    public static void m22204b() {
        synchronized (f17939a) {
            f17940b = true;
            f17939a.notifyAll();
        }
    }

    private static void m22206c() {
        synchronized (f17939a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + 10000;
                while (!f17940b) {
                    f17939a.wait(10);
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
