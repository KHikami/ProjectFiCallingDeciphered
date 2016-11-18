package p000;

import java.util.Vector;

public final class aig {
    private Vector<aio> f918a;

    public aig() {
        this.f918a = null;
        this.f918a = new Vector();
    }

    public boolean m2470a(aio aio) {
        if (aio != null) {
            return this.f918a.add(aio);
        }
        throw new NullPointerException();
    }

    public void m2469a(int i, aio aio) {
        if (aio == null) {
            throw new NullPointerException();
        }
        this.f918a.add(0, aio);
    }

    public void m2468a() {
        this.f918a.clear();
    }

    public aio m2467a(int i) {
        return (aio) this.f918a.get(i);
    }

    public int m2471b() {
        return this.f918a.size();
    }
}
