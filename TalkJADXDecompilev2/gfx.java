package defpackage;

public final class gfx extends nzf {
    private static volatile gfx[] e;
    public String a;
    public String b;
    public long c;
    public boolean d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static gfx[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new gfx[0];
                }
            }
        }
        return e;
    }

    public gfx() {
        e();
    }

    private gfx e() {
        this.a = "";
        this.b = "";
        this.c = 0;
        this.d = false;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (this.c != 0) {
            nyu.b(3, this.c);
        }
        if (this.d) {
            nyu.a(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (this.c != 0) {
            b += nyu.f(3, this.c);
        }
        if (!this.d) {
            return b;
        }
        boolean z = this.d;
        return b + (nyu.h(4) + 1);
    }

    private gfx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = nyt.e();
                    continue;
                case 32:
                    this.d = nyt.i();
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
