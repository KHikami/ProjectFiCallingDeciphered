package p000;

public final class myl extends nyx<myl> {
    private static volatile myl[] f29154d;
    public Integer f29155a;
    public String[] f29156b;
    public myk f29157c;

    public /* synthetic */ nzf m33821a(nyt nyt) {
        return m33818b(nyt);
    }

    public static myl[] m33819d() {
        if (f29154d == null) {
            synchronized (nzc.f31309c) {
                if (f29154d == null) {
                    f29154d = new myl[0];
                }
            }
        }
        return f29154d;
    }

    public myl() {
        m33820g();
    }

    private myl m33820g() {
        this.f29156b = nzl.f31332f;
        this.f29157c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33822a(nyu nyu) {
        if (this.f29155a != null) {
            nyu.m37168a(1, this.f29155a.intValue());
        }
        if (this.f29156b != null && this.f29156b.length > 0) {
            for (String str : this.f29156b) {
                if (str != null) {
                    nyu.m37170a(2, str);
                }
            }
        }
        if (this.f29157c != null) {
            nyu.m37182b(3, this.f29157c);
        }
        super.a(nyu);
    }

    protected int m33823b() {
        int i = 0;
        int b = super.b();
        if (this.f29155a != null) {
            b += nyu.m37147f(1, this.f29155a.intValue());
        }
        if (this.f29156b != null && this.f29156b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f29156b.length) {
                String str = this.f29156b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f29157c != null) {
            return b + nyu.m37145d(3, this.f29157c);
        }
        return b;
    }

    private myl m33818b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f29155a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    a = this.f29156b == null ? 0 : this.f29156b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29156b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f29156b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f29157c == null) {
                        this.f29157c = new myk();
                    }
                    nyt.m37101a(this.f29157c);
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
