package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public abstract class gui {
    static final Set<gui> a = Collections.newSetFromMap(new WeakHashMap());

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult a(long j, TimeUnit timeUnit);

    public <C extends gug> C a(gue<C> gue_C) {
        throw new UnsupportedOperationException();
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public <L> hge<L> a(L l) {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(guk guk);

    public abstract void a(gul gul);

    public void a(hgm hgm) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends gud, T extends heb<? extends gup, A>> T b(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void b();

    public abstract void b(guk guk);

    public abstract void b(gul gul);

    public void b(hgm hgm) {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult c();

    public abstract void d();

    public abstract boolean e();

    public abstract boolean f();
}
