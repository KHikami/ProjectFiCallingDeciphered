package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class guu<O extends gua> implements ParcelableCompatCreatorCallbacks {
    private final Context a;
    private final hgh b;
    private final gtz<O> c;
    private final O d;
    private final hdx<O> e;
    private final int f;
    private final hfn g;
    private final AtomicBoolean h;
    private final AtomicInteger i;

    public void a() {
        boolean z = true;
        if (!this.h.getAndSet(true)) {
            this.b.a();
            hfn hfn = this.g;
            int i = this.f;
            if (this.i.get() <= 0) {
                z = false;
            }
            hfn.a(i, z);
        }
    }

    public gtz<O> b() {
        return this.c;
    }

    public O c() {
        return this.d;
    }

    public hdx<O> d() {
        return this.e;
    }

    public Context e() {
        return this.a;
    }

    public static z b(Parcel parcel, ClassLoader classLoader) {
        return new z(parcel, classLoader);
    }

    public static z[] b(int i) {
        return new z[i];
    }

    public /* synthetic */ Object[] a(int i) {
        return guu.b(i);
    }

    public /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
        return guu.b(parcel, null);
    }
}
