package p000;

public final class opv extends nyx<opv> {
    private static volatile opv[] f33605d;
    public oqa f33606a;
    public opt f33607b;
    public opw f33608c;

    public /* synthetic */ nzf m39108a(nyt nyt) {
        return m39105b(nyt);
    }

    public static opv[] m39106d() {
        if (f33605d == null) {
            synchronized (nzc.f31309c) {
                if (f33605d == null) {
                    f33605d = new opv[0];
                }
            }
        }
        return f33605d;
    }

    public opv() {
        m39107g();
    }

    private opv m39107g() {
        this.f33606a = null;
        this.f33607b = null;
        this.f33608c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39109a(nyu nyu) {
        if (this.f33606a != null) {
            nyu.m37182b(1, this.f33606a);
        }
        if (this.f33607b != null) {
            nyu.m37182b(2, this.f33607b);
        }
        if (this.f33608c != null) {
            nyu.m37182b(4, this.f33608c);
        }
        super.a(nyu);
    }

    protected int m39110b() {
        int b = super.b();
        if (this.f33606a != null) {
            b += nyu.m37145d(1, this.f33606a);
        }
        if (this.f33607b != null) {
            b += nyu.m37145d(2, this.f33607b);
        }
        if (this.f33608c != null) {
            return b + nyu.m37145d(4, this.f33608c);
        }
        return b;
    }

    private opv m39105b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33606a == null) {
                        this.f33606a = new oqa();
                    }
                    nyt.m37101a(this.f33606a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33607b == null) {
                        this.f33607b = new opt();
                    }
                    nyt.m37101a(this.f33607b);
                    continue;
                case 34:
                    if (this.f33608c == null) {
                        this.f33608c = new opw();
                    }
                    nyt.m37101a(this.f33608c);
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
