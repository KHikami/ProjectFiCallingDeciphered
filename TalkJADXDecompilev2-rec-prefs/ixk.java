package p000;

import java.lang.Thread.UncaughtExceptionHandler;

public class ixk {
    private static final ixk f19339a;
    private static volatile ixk f19340b;
    private final ixl f19341c;

    static {
        ixk ixk = new ixk(new ixg());
        f19339a = ixk;
        f19340b = ixk;
    }

    private ixk(ixl ixl) {
        this.f19341c = (ixl) ba.m4536a((Object) ixl);
    }

    public static synchronized ixk m23445a(ivy ivy) {
        ixk ixk;
        synchronized (ixk.class) {
            if (f19340b.m23449b()) {
                ixk = f19340b;
            } else {
                ixk = new ixk(ivy.mo3418a());
                f19340b = ixk;
            }
        }
        return ixk;
    }

    public void m23447a() {
        this.f19341c.mo3415a();
    }

    public void m23448a(String str) {
        this.f19341c.mo3416a(str);
    }

    public UncaughtExceptionHandler m23446a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        return this.f19341c.mo3414a(uncaughtExceptionHandler);
    }

    public boolean m23449b() {
        return this != f19339a;
    }
}
