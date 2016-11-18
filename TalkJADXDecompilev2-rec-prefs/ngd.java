package p000;

public final class ngd extends nyx<ngd> {
    private static volatile ngd[] f29761c;
    public String[] f29762a;
    public String f29763b;

    public /* synthetic */ nzf m34790a(nyt nyt) {
        return m34787b(nyt);
    }

    public static ngd[] m34788d() {
        if (f29761c == null) {
            synchronized (nzc.f31309c) {
                if (f29761c == null) {
                    f29761c = new ngd[0];
                }
            }
        }
        return f29761c;
    }

    public ngd() {
        m34789g();
    }

    private ngd m34789g() {
        this.f29762a = nzl.f31332f;
        this.f29763b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34791a(nyu nyu) {
        if (this.f29762a != null && this.f29762a.length > 0) {
            for (String str : this.f29762a) {
                if (str != null) {
                    nyu.m37170a(1, str);
                }
            }
        }
        if (this.f29763b != null) {
            nyu.m37170a(2, this.f29763b);
        }
        super.a(nyu);
    }

    protected int m34792b() {
        int i = 0;
        int b = super.b();
        if (this.f29762a == null || this.f29762a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f29762a.length) {
                String str = this.f29762a[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f29763b != null) {
            return i + nyu.m37137b(2, this.f29763b);
        }
        return i;
    }

    private ngd m34787b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    a = this.f29762a == null ? 0 : this.f29762a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29762a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f29762a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f29763b = nyt.m37117j();
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
