package p000;

public final class ldg extends nyx<ldg> {
    private static volatile ldg[] f24658e;
    public Integer f24659a;
    public String f24660b;
    public Boolean f24661c;
    public Integer f24662d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28723b(nyt);
    }

    public static ldg[] m28724d() {
        if (f24658e == null) {
            synchronized (nzc.c) {
                if (f24658e == null) {
                    f24658e = new ldg[0];
                }
            }
        }
        return f24658e;
    }

    public ldg() {
        m28725g();
    }

    private ldg m28725g() {
        this.f24660b = null;
        this.f24661c = null;
        this.f24662d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24659a != null) {
            nyu.a(1, this.f24659a.intValue());
        }
        if (this.f24660b != null) {
            nyu.a(2, this.f24660b);
        }
        if (this.f24661c != null) {
            nyu.a(3, this.f24661c.booleanValue());
        }
        if (this.f24662d != null) {
            nyu.a(4, this.f24662d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24659a != null) {
            b += nyu.f(1, this.f24659a.intValue());
        }
        if (this.f24660b != null) {
            b += nyu.b(2, this.f24660b);
        }
        if (this.f24661c != null) {
            this.f24661c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f24662d != null) {
            return b + nyu.f(4, this.f24662d.intValue());
        }
        return b;
    }

    private ldg m28723b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f24659a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24660b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24661c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f24662d = Integer.valueOf(nyt.f());
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
