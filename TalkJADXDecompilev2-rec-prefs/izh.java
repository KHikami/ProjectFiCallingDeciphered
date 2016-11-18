package p000;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public final class izh extends PhantomReference<Object> {
    final String f19474a;
    izh f19475b;
    izh f19476c;

    public izh(Object obj, String str, ReferenceQueue<? super Object> referenceQueue) {
        super(obj, referenceQueue);
        this.f19474a = str;
    }

    public void m23576a(izh izh) {
        ba.m4536a((Object) izh);
        this.f19475b = izh;
        this.f19476c = izh.f19476c;
        if (this.f19476c != null) {
            this.f19476c.f19475b = this;
        }
        izh.f19476c = this;
    }

    public izh m23575a() {
        if (this.f19475b != null) {
            this.f19475b.f19476c = this.f19476c;
        }
        if (this.f19476c != null) {
            this.f19476c.f19475b = this.f19475b;
        }
        this.f19476c = null;
        this.f19475b = null;
        return this;
    }
}
