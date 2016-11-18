package defpackage;

public final class opv extends nyx<opv> {
    private static volatile opv[] d;
    public oqa a;
    public opt b;
    public opw c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static opv[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new opv[0];
                }
            }
        }
        return d;
    }

    public opv() {
        g();
    }

    private opv g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            return b + nyu.d(4, this.c);
        }
        return b;
    }

    private opv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oqa();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new opt();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    if (this.c == null) {
                        this.c = new opw();
                    }
                    nyt.a(this.c);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
