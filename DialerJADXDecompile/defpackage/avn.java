package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: avn */
public final class avn {
    private static i a;

    static {
        a = null;
    }

    public static avm a() {
        avm avm;
        synchronized (avn.class) {
            avm = new avm(AsyncTask.SERIAL_EXECUTOR);
        }
        return avm;
    }

    public static avm b() {
        avm avm;
        synchronized (avn.class) {
            avm = new avm(AsyncTask.THREAD_POOL_EXECUTOR);
        }
        return avm;
    }
}
