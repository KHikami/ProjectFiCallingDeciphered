package p000;

import java.io.Closeable;
import java.lang.reflect.Method;

final class mrd implements mre {
    static final mrd f28145a = new mrd();
    static final Method f28146b = mrd.m32751a();

    mrd() {
    }

    private static Method m32751a() {
        try {
            return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Throwable th) {
            return null;
        }
    }

    public void mo3920a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                f28146b.invoke(th, new Object[]{th2});
            } catch (Throwable th3) {
                mrc.f28144a.mo3920a(closeable, th, th2);
            }
        }
    }
}
