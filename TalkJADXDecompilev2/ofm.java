package defpackage;

public final class ofm extends nyx<ofm> {
    private static volatile ofm[] c;
    public nzr a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ofm[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new ofm[0];
                }
            }
        }
        return c;
    }

    public ofm() {
        g();
    }

    private ofm g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.b(3, this.b);
        }
        return b;
    }

    private ofm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nzr();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
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
