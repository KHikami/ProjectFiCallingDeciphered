package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: dcr */
public final class dcr extends buf {
    static {
        dcq dcq = new dcq();
    }

    public static Object b(Future future) {
        cob.b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return buf.a(future);
    }
}
