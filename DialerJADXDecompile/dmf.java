/* compiled from: PG */
final class dmf {
    private static dme a;
    private static long b;

    private dmf() {
    }

    static dme a() {
        synchronized (dmf.class) {
            if (a != null) {
                dme dme = a;
                a = dme.f;
                dme.f = null;
                b -= 2048;
                return dme;
            }
            return new dme();
        }
    }

    static void a(dme dme) {
        if (dme.f != null || dme.g != null) {
            throw new IllegalArgumentException();
        } else if (!dme.d) {
            synchronized (dmf.class) {
                if (b + 2048 > 65536) {
                    return;
                }
                b += 2048;
                dme.f = a;
                dme.c = 0;
                dme.b = 0;
                a = dme;
            }
        }
    }
}
