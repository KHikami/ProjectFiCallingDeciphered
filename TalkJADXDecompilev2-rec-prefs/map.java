package p000;

public final class map extends nyx<map> {
    private static volatile map[] f27134c;
    public String f27135a;
    public int[] f27136b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31460b(nyt);
    }

    public static map[] m31461d() {
        if (f27134c == null) {
            synchronized (nzc.c) {
                if (f27134c == null) {
                    f27134c = new map[0];
                }
            }
        }
        return f27134c;
    }

    public map() {
        m31462g();
    }

    private map m31462g() {
        this.f27135a = null;
        this.f27136b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27135a != null) {
            nyu.a(1, this.f27135a);
        }
        if (this.f27136b != null && this.f27136b.length > 0) {
            for (int c : this.f27136b) {
                nyu.c(2, c);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27135a != null) {
            b += nyu.b(1, this.f27135a);
        }
        if (this.f27136b == null || this.f27136b.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f27136b.length) {
            i2 += nyu.j(this.f27136b[i]);
            i++;
        }
        return (b + i2) + (this.f27136b.length * 1);
    }

    private map m31460b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27135a = nyt.j();
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.f27136b == null ? 0 : this.f27136b.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27136b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.l();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.l();
                    this.f27136b = obj;
                    continue;
                case wi.dH /*18*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.l();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f27136b == null ? 0 : this.f27136b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f27136b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.l();
                        b++;
                    }
                    this.f27136b = obj2;
                    nyt.e(d);
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
