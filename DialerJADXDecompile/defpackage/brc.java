package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: brc */
public abstract class brc {
    static final Set a;

    static {
        a = Collections.newSetFromMap(new WeakHashMap());
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public bra a(brb brb) {
        throw new UnsupportedOperationException();
    }

    public brq a(brq brq) {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult a(long j, TimeUnit timeUnit);

    public abstract void a(brf brf);

    public abstract void a(brg brg);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public brq b(brq brq) {
        throw new UnsupportedOperationException();
    }

    public abstract void b();

    public abstract void b(brf brf);

    public abstract void b(brg brg);

    public abstract void c();

    public abstract boolean d();

    public abstract boolean e();
}
