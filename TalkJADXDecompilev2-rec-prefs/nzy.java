package p000;

public final class nzy extends nyx<nzy> {
    public Long f31402a;
    public String f31403b;
    public String f31404c;
    public String f31405d;
    public String[] f31406e;
    public byte[] f31407f;

    public /* synthetic */ nzf m37324a(nyt nyt) {
        return m37322b(nyt);
    }

    public nzy() {
        m37323d();
    }

    private nzy m37323d() {
        this.f31402a = null;
        this.f31403b = null;
        this.f31404c = null;
        this.f31405d = null;
        this.f31406e = nzl.f31332f;
        this.f31407f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37325a(nyu nyu) {
        if (this.f31402a != null) {
            nyu.m37169a(1, this.f31402a.longValue());
        }
        if (this.f31403b != null) {
            nyu.m37170a(2, this.f31403b);
        }
        if (this.f31404c != null) {
            nyu.m37170a(3, this.f31404c);
        }
        if (this.f31405d != null) {
            nyu.m37170a(4, this.f31405d);
        }
        if (this.f31406e != null && this.f31406e.length > 0) {
            for (String str : this.f31406e) {
                if (str != null) {
                    nyu.m37170a(5, str);
                }
            }
        }
        if (this.f31407f != null) {
            nyu.m37173a(8, this.f31407f);
        }
        super.a(nyu);
    }

    protected int m37326b() {
        int i = 0;
        int b = super.b();
        if (this.f31402a != null) {
            b += nyu.m37146e(1, this.f31402a.longValue());
        }
        if (this.f31403b != null) {
            b += nyu.m37137b(2, this.f31403b);
        }
        if (this.f31404c != null) {
            b += nyu.m37137b(3, this.f31404c);
        }
        if (this.f31405d != null) {
            b += nyu.m37137b(4, this.f31405d);
        }
        if (this.f31406e != null && this.f31406e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f31406e.length) {
                String str = this.f31406e[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f31407f != null) {
            return b + nyu.m37139b(8, this.f31407f);
        }
        return b;
    }

    private nzy m37322b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31402a = Long.valueOf(nyt.m37109d());
                    continue;
                case wi.dH /*18*/:
                    this.f31403b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31404c = nyt.m37117j();
                    continue;
                case 34:
                    this.f31405d = nyt.m37117j();
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    a = this.f31406e == null ? 0 : this.f31406e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31406e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f31406e = obj;
                    continue;
                case 66:
                    this.f31407f = nyt.m37118k();
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
