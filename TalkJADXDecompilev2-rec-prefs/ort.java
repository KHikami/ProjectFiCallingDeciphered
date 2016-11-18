package p000;

public final class ort extends nyx<ort> {
    private static volatile ort[] f34074c;
    public oqv[] f34075a;
    public String[] f34076b;

    public /* synthetic */ nzf m39484a(nyt nyt) {
        return m39481b(nyt);
    }

    public static ort[] m39482d() {
        if (f34074c == null) {
            synchronized (nzc.f31309c) {
                if (f34074c == null) {
                    f34074c = new ort[0];
                }
            }
        }
        return f34074c;
    }

    public ort() {
        m39483g();
    }

    private ort m39483g() {
        this.f34075a = oqv.m39246d();
        this.f34076b = nzl.f31332f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39485a(nyu nyu) {
        int i = 0;
        if (this.f34075a != null && this.f34075a.length > 0) {
            for (nzf nzf : this.f34075a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f34076b != null && this.f34076b.length > 0) {
            while (i < this.f34076b.length) {
                String str = this.f34076b[i];
                if (str != null) {
                    nyu.m37170a(2, str);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m39486b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f34075a != null && this.f34075a.length > 0) {
            i = b;
            for (nzf nzf : this.f34075a) {
                if (nzf != null) {
                    i += nyu.m37145d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f34076b == null || this.f34076b.length <= 0) {
            return b;
        }
        i = 0;
        int i3 = 0;
        while (i2 < this.f34076b.length) {
            String str = this.f34076b[i2];
            if (str != null) {
                i3++;
                i += nyu.m37140b(str);
            }
            i2++;
        }
        return (b + i) + (i3 * 1);
    }

    private ort m39481b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f34075a == null) {
                        a = 0;
                    } else {
                        a = this.f34075a.length;
                    }
                    obj = new oqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34075a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqv();
                    nyt.m37101a(obj[a]);
                    this.f34075a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    a = this.f34076b == null ? 0 : this.f34076b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34076b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f34076b = obj;
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
