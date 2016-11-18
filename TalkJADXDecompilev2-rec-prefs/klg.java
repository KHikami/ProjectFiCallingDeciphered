package p000;

public final class klg extends nyx<klg> {
    private static volatile klg[] f22144c;
    public klf f22145a;
    public klf f22146b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26372b(nyt);
    }

    public static klg[] m26373d() {
        if (f22144c == null) {
            synchronized (nzc.c) {
                if (f22144c == null) {
                    f22144c = new klg[0];
                }
            }
        }
        return f22144c;
    }

    public klg() {
        m26374g();
    }

    private klg m26374g() {
        this.f22145a = null;
        this.f22146b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22145a != null) {
            nyu.b(1, this.f22145a);
        }
        if (this.f22146b != null) {
            nyu.b(2, this.f22146b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22145a != null) {
            b += nyu.d(1, this.f22145a);
        }
        if (this.f22146b != null) {
            return b + nyu.d(2, this.f22146b);
        }
        return b;
    }

    private klg m26372b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22145a == null) {
                        this.f22145a = new klf();
                    }
                    nyt.a(this.f22145a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22146b == null) {
                        this.f22146b = new klf();
                    }
                    nyt.a(this.f22146b);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
