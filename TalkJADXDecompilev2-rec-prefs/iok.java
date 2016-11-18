package p000;

import java.util.concurrent.atomic.AtomicReference;

public abstract class iok {
    public final ind f18129l;
    public final ild f18130m;
    public final AtomicReference<itp> f18131n = new AtomicReference(new itp());
    public volatile boolean f18132o = true;
    public Object f18133p;
    public int f18134q = -1;
    public int f18135r = -1;
    public boolean f18136s;

    public abstract void mo3275b();

    abstract boolean mo3276e();

    abstract String mo3277f();

    abstract int mo3278g();

    iok(ind ind, ild ild) {
        this.f18129l = ind;
        this.f18130m = ild;
    }

    Object m22362n() {
        iil.m21880c();
        return this.f18133p;
    }

    public void mo3273a(Object obj) {
        this.f18130m.m22233a(new iol(this, obj));
    }

    int m22363o() {
        return this.f18134q;
    }

    int m22364p() {
        return this.f18135r;
    }

    boolean m22365q() {
        return this.f18136s;
    }

    public itp m22366r() {
        return (itp) this.f18131n.get();
    }

    void mo3274a(boolean z) {
        if (this.f18132o != z) {
            this.f18132o = z;
            this.f18129l.m22337e();
        }
    }

    boolean mo3279h() {
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(mo3277f());
        String valueOf2 = String.valueOf(m22366r());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("/").append(valueOf2).toString();
    }

    float[] mo3280i() {
        return ity.f19013a;
    }
}
