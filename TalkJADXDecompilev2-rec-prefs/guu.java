package p000;

import android.content.Context;
import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class guu<O extends gua> implements ParcelableCompatCreatorCallbacks {
    private final Context f16184a;
    private final hgh f16185b;
    private final gtz<O> f16186c;
    private final O f16187d;
    private final hdx<O> f16188e;
    private final int f16189f;
    private final hfn f16190g;
    private final AtomicBoolean f16191h;
    private final AtomicInteger f16192i;

    public void m18655a() {
        boolean z = true;
        if (!this.f16191h.getAndSet(true)) {
            this.f16185b.m19734a();
            hfn hfn = this.f16190g;
            int i = this.f16189f;
            if (this.f16192i.get() <= 0) {
                z = false;
            }
            hfn.m19665a(i, z);
        }
    }

    public gtz<O> m18657b() {
        return this.f16186c;
    }

    public O m18658c() {
        return this.f16187d;
    }

    public hdx<O> m18659d() {
        return this.f16188e;
    }

    public Context m18660e() {
        return this.f16184a;
    }

    public static z m18652b(Parcel parcel, ClassLoader classLoader) {
        return new z(parcel, classLoader);
    }

    public static z[] m18653b(int i) {
        return new z[i];
    }

    public /* synthetic */ Object[] m18656a(int i) {
        return guu.m18653b(i);
    }

    public /* synthetic */ Object m18654a(Parcel parcel, ClassLoader classLoader) {
        return guu.m18652b(parcel, null);
    }
}
