package p000;

public final class ldw extends nyx<ldw> {
    private static volatile ldw[] f24726e;
    public ldx f24727a;
    public lee f24728b;
    public Boolean f24729c;
    public leh f24730d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28799b(nyt);
    }

    public static ldw[] m28800d() {
        if (f24726e == null) {
            synchronized (nzc.c) {
                if (f24726e == null) {
                    f24726e = new ldw[0];
                }
            }
        }
        return f24726e;
    }

    public ldw() {
        m28801g();
    }

    private ldw m28801g() {
        this.f24727a = null;
        this.f24728b = null;
        this.f24729c = null;
        this.f24730d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24727a != null) {
            nyu.b(1, this.f24727a);
        }
        if (this.f24728b != null) {
            nyu.b(2, this.f24728b);
        }
        if (this.f24729c != null) {
            nyu.a(3, this.f24729c.booleanValue());
        }
        if (this.f24730d != null) {
            nyu.b(5, this.f24730d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24727a != null) {
            b += nyu.d(1, this.f24727a);
        }
        if (this.f24728b != null) {
            b += nyu.d(2, this.f24728b);
        }
        if (this.f24729c != null) {
            this.f24729c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f24730d != null) {
            return b + nyu.d(5, this.f24730d);
        }
        return b;
    }

    private ldw m28799b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24727a == null) {
                        this.f24727a = new ldx();
                    }
                    nyt.a(this.f24727a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24728b == null) {
                        this.f24728b = new lee();
                    }
                    nyt.a(this.f24728b);
                    continue;
                case wi.dA /*24*/:
                    this.f24729c = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.f24730d == null) {
                        this.f24730d = new leh();
                    }
                    nyt.a(this.f24730d);
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
