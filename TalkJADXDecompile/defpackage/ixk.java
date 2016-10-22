package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: ixk */
public class ixk {
    private static final ixk a;
    private static volatile ixk b;
    private final ixl c;

    static {
        ixk ixk = new ixk(new ixg());
        a = ixk;
        b = ixk;
    }

    private ixk(ixl ixl) {
        this.c = (ixl) ba.a((Object) ixl);
    }

    public static synchronized ixk a(ivy ivy) {
        ixk ixk;
        synchronized (ixk.class) {
            if (b.b()) {
                ixk = b;
            } else {
                ixk = new ixk(ivy.a());
                b = ixk;
            }
        }
        return ixk;
    }

    public void a() {
        this.c.a();
    }

    public void a(String str) {
        this.c.a(str);
    }

    public UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        return this.c.a(uncaughtExceptionHandler);
    }

    public boolean b() {
        return this != a;
    }
}
