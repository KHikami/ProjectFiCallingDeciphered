package io.grpc.internal;

import bm;
import gwb;
import java.io.InputStream;
import mex;
import ojw;
import ojx;
import oki;

public abstract class h<IdT> implements da {
    private i a;
    private boolean b;
    final ch g;
    public final cc h;
    i i;
    public int j;
    public int k;
    public final Object l;

    public abstract IdT a();

    protected abstract void a(InputStream inputStream);

    public abstract void a(Throwable th);

    protected abstract void b();

    public abstract void b(int i);

    protected abstract void b(dm dmVar, boolean z, boolean z2);

    protected abstract void c();

    protected abstract db g();

    h(dn dnVar, int i) {
        this.i = i.HEADERS;
        this.a = i.HEADERS;
        this.j = 32768;
        this.l = new Object();
        this.g = new ch(new ck(this), dnVar);
        this.h = new cc(new ce(this), ojw.a, i);
    }

    public void b(InputStream inputStream) {
        bm.a((Object) inputStream, (Object) "message");
        b(i.MESSAGE);
        if (!this.g.b()) {
            this.g.a(inputStream);
        }
    }

    public final void h() {
        if (!this.g.b()) {
            this.g.a();
        }
    }

    public boolean e() {
        boolean z = false;
        if (!(g() == null || this.a == i.STATUS)) {
            synchronized (this.l) {
                if (this.b && this.k < this.j) {
                    z = true;
                }
            }
        }
        return z;
    }

    public void i() {
        this.g.d();
    }

    protected final void a(cm cmVar, boolean z) {
        try {
            this.h.a(cmVar, z);
        } catch (Throwable th) {
            a(th);
        }
    }

    public final void a(ojx ojx) {
        this.g.a((ojx) bm.a((Object) ojx, (Object) "compressor"));
    }

    public final void a(oki oki) {
        this.h.a((oki) bm.a((Object) oki, (Object) "decompressor"));
    }

    public final void j() {
        boolean z = true;
        bm.b(g() != null);
        synchronized (this.l) {
            if (this.b) {
                z = false;
            }
            bm.b(z, (Object) "Already allocated");
            this.b = true;
        }
        k();
    }

    public final void k() {
        synchronized (this.l) {
            boolean e = e();
        }
        if (e) {
            g().a();
        }
    }

    final i a(i iVar) {
        i iVar2 = this.i;
        this.i = a(this.i, iVar);
        return iVar2;
    }

    final i b(i iVar) {
        i iVar2 = this.a;
        this.a = a(this.a, iVar);
        return iVar2;
    }

    i a(i iVar, i iVar2) {
        if (iVar2.ordinal() >= iVar.ordinal()) {
            return iVar2;
        }
        throw new IllegalStateException(String.format("Cannot transition phase from %s to %s", new Object[]{iVar, iVar2}));
    }

    public String toString() {
        return f().toString();
    }

    protected mex f() {
        return gwb.P((Object) this).a("id", a()).a("inboundPhase", this.i.name()).a("outboundPhase", this.a.name());
    }
}
