package p000;

public final class gfx extends nzf {
    private static volatile gfx[] f15188e;
    public String f15189a;
    public String f15190b;
    public long f15191c;
    public boolean f15192d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m17580b(nyt);
    }

    public static gfx[] m17581d() {
        if (f15188e == null) {
            synchronized (nzc.c) {
                if (f15188e == null) {
                    f15188e = new gfx[0];
                }
            }
        }
        return f15188e;
    }

    public gfx() {
        m17582e();
    }

    private gfx m17582e() {
        this.f15189a = "";
        this.f15190b = "";
        this.f15191c = 0;
        this.f15192d = false;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f15189a == null || this.f15189a.equals(""))) {
            nyu.a(1, this.f15189a);
        }
        if (!(this.f15190b == null || this.f15190b.equals(""))) {
            nyu.a(2, this.f15190b);
        }
        if (this.f15191c != 0) {
            nyu.b(3, this.f15191c);
        }
        if (this.f15192d) {
            nyu.a(4, this.f15192d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f15189a == null || this.f15189a.equals(""))) {
            b += nyu.b(1, this.f15189a);
        }
        if (!(this.f15190b == null || this.f15190b.equals(""))) {
            b += nyu.b(2, this.f15190b);
        }
        if (this.f15191c != 0) {
            b += nyu.f(3, this.f15191c);
        }
        if (!this.f15192d) {
            return b;
        }
        boolean z = this.f15192d;
        return b + (nyu.h(4) + 1);
    }

    private gfx m17580b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f15189a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f15190b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f15191c = nyt.e();
                    continue;
                case 32:
                    this.f15192d = nyt.i();
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
