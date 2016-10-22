package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: iok */
public abstract class iok {
    public final ind l;
    public final ild m;
    public final AtomicReference<itp> n;
    public volatile boolean o;
    public Object p;
    public int q;
    public int r;
    public boolean s;

    public abstract void b();

    abstract boolean e();

    abstract String f();

    abstract int g();

    iok(ind ind, ild ild) {
        this.n = new AtomicReference(new itp());
        this.o = true;
        this.q = -1;
        this.r = -1;
        this.l = ind;
        this.m = ild;
    }

    Object n() {
        iil.c();
        return this.p;
    }

    public void a(Object obj) {
        this.m.a(new iol(this, obj));
    }

    int o() {
        return this.q;
    }

    int p() {
        return this.r;
    }

    boolean q() {
        return this.s;
    }

    public itp r() {
        return (itp) this.n.get();
    }

    void a(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.l.e();
        }
    }

    boolean h() {
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(f());
        String valueOf2 = String.valueOf(r());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("/").append(valueOf2).toString();
    }

    float[] i() {
        return ity.a;
    }
}
