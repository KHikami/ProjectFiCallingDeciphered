package defpackage;

import java.util.Vector;

/* renamed from: aig */
public final class aig {
    private Vector<aio> a;

    public aig() {
        this.a = null;
        this.a = new Vector();
    }

    public boolean a(aio aio) {
        if (aio != null) {
            return this.a.add(aio);
        }
        throw new NullPointerException();
    }

    public void a(int i, aio aio) {
        if (aio == null) {
            throw new NullPointerException();
        }
        this.a.add(0, aio);
    }

    public void a() {
        this.a.clear();
    }

    public aio a(int i) {
        return (aio) this.a.get(i);
    }

    public int b() {
        return this.a.size();
    }
}
