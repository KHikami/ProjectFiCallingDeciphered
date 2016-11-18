package p000;

public final class jbf extends nzf {
    private static volatile jbf[] f19677g;
    public String f19678a;
    public String f19679b;
    public String[] f19680c;
    public String f19681d;
    public boolean f19682e;
    public String f19683f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m23767b(nyt);
    }

    public static jbf[] m23768d() {
        if (f19677g == null) {
            synchronized (nzc.c) {
                if (f19677g == null) {
                    f19677g = new jbf[0];
                }
            }
        }
        return f19677g;
    }

    public jbf() {
        m23769e();
    }

    private jbf m23769e() {
        this.f19678a = "";
        this.f19679b = "";
        this.f19680c = nzl.f;
        this.f19681d = "";
        this.f19682e = false;
        this.f19683f = "";
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f19678a);
        nyu.a(2, this.f19679b);
        if (this.f19680c != null && this.f19680c.length > 0) {
            for (String str : this.f19680c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (!this.f19681d.equals("")) {
            nyu.a(4, this.f19681d);
        }
        if (!this.f19683f.equals("")) {
            nyu.a(5, this.f19683f);
        }
        if (this.f19682e) {
            nyu.a(6, this.f19682e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = (super.mo147b() + nyu.b(1, this.f19678a)) + nyu.b(2, this.f19679b);
        if (this.f19680c == null || this.f19680c.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f19680c.length) {
                String str = this.f19680c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (!this.f19681d.equals("")) {
            i += nyu.b(4, this.f19681d);
        }
        if (!this.f19683f.equals("")) {
            i += nyu.b(5, this.f19683f);
        }
        if (this.f19682e) {
            return i + nyu.b(6, this.f19682e);
        }
        return i;
    }

    private jbf m23767b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f19678a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f19679b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.f19680c == null ? 0 : this.f19680c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f19680c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f19680c = obj;
                    continue;
                case 34:
                    this.f19681d = nyt.j();
                    continue;
                case 42:
                    this.f19683f = nyt.j();
                    continue;
                case 48:
                    this.f19682e = nyt.i();
                    continue;
                default:
                    if (!nzl.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
