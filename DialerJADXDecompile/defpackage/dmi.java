package defpackage;

import java.io.InterruptedIOException;

/* compiled from: PG */
/* renamed from: dmi */
public class dmi {
    static {
        dmj dmj = new dmj();
    }

    public final long d() {
        throw new IllegalStateException("No deadline");
    }

    public void e() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
    }
}
