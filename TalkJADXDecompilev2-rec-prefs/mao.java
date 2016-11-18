package p000;

public final class mao extends nyx<mao> {
    public int[] f27132a;
    public map[] f27133b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31455b(nyt);
    }

    public mao() {
        m31456d();
    }

    private mao m31456d() {
        this.f27132a = nzl.a;
        this.f27133b = map.m31461d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27132a != null && this.f27132a.length > 0) {
            for (int c : this.f27132a) {
                nyu.c(1, c);
            }
        }
        if (this.f27133b != null && this.f27133b.length > 0) {
            while (i < this.f27133b.length) {
                nzf nzf = this.f27133b[i];
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f27132a == null || this.f27132a.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            for (int j : this.f27132a) {
                i3 += nyu.j(j);
            }
            i = (b + i3) + (this.f27132a.length * 1);
        }
        if (this.f27133b != null && this.f27133b.length > 0) {
            while (i2 < this.f27133b.length) {
                nzf nzf = this.f27133b[i2];
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
                i2++;
            }
        }
        return i;
    }

    private mao m31455b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    b = nzl.b(nyt, 8);
                    a = this.f27132a == null ? 0 : this.f27132a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27132a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.l();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.l();
                    this.f27132a = obj;
                    continue;
                case 10:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.l();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f27132a == null ? 0 : this.f27132a.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f27132a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.l();
                        b++;
                    }
                    this.f27132a = obj2;
                    nyt.e(d);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27133b == null) {
                        a = 0;
                    } else {
                        a = this.f27133b.length;
                    }
                    obj = new map[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27133b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new map();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new map();
                    nyt.a(obj[a]);
                    this.f27133b = obj;
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
